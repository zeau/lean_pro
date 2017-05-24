package com.bidanet.bdcms.core.driver.cache;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.io.File;
import java.io.IOException;

/**
 * Created by xuejike on 2017/3/4.
 */
public class RedissonFactory {
    public static RedissonClient getRedisson(String host,String pwd,int db){
        Config config = new Config();
//        config.setUseLinuxNativeEpoll(true);

        config.useSingleServer().setAddress(host).setDatabase(db).setPassword(pwd);
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
    public static RedissonClient getRedissonByJson(String configPath) throws IOException {
        Config config = Config.fromJSON(new File(configPath));
        return Redisson.create(config);
    }
}
