package com.bidanet.bdcms.core.driver.cache;

import org.redisson.api.RBucket;
import org.redisson.api.RBuckets;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by xuejike on 2017/3/4.
 */
public class RedissonCache implements Cache {

    @Autowired
    RedissonClient redissonClient;
    @Override
    public void set(String s, String s1) {
        RBucket<Object> bucket = redissonClient.getBucket(s);
        bucket.set(s1);
    }

    @Override
    public void set(String s, Object o) {
        RBucket<Object> bucket = redissonClient.getBucket(s);
        bucket.set(o);
    }

    @Override
    public void set(String s, String s1, int i) {
        RBucket<String> bucket = redissonClient.getBucket(s);
        bucket.set(s1);
        bucket.set(s1,i, TimeUnit.SECONDS);

    }

    @Override
    public void set(String s, Object o, int i) {
        RBucket<Object> bucket = redissonClient.getBucket(s);
        bucket.set(o);
        bucket.set(o,i, TimeUnit.SECONDS);

    }

    @Override
    public void expire(String s, int i) {
        RBucket<Object> bucket = redissonClient.getBucket(s);
        bucket.expire(i,TimeUnit.SECONDS);
    }

    @Override
    public String get(String s) {
        RBucket<String> bucket = redissonClient.getBucket(s);
        return bucket.get();
    }

    @Override
    public List<String> get(String... strings) {
        Map<String, String> map = redissonClient.getBuckets().get(strings);
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {

            list.add(map.get(string));
        }

        return list;
    }

    @Override
    public <T> T get(String s, Class<T> aClass) {
        return (T)redissonClient.getBucket(s).get();
    }

    @Override
    public <T> List<T> getArray(String s, Class<T> aClass) {
        return (List<T>) redissonClient.getBucket(s).get();
    }

    @Override
    public void delete(String... strings) {
        RBuckets buckets = redissonClient.getBuckets();
     redissonClient.getKeys().delete(strings);
    }

    @Override
    public void clean() {
        redissonClient.getKeys().flushdb();
    }
}
