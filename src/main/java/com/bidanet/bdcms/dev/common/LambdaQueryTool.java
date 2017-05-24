package com.bidanet.bdcms.dev.common;

import com.bidanet.hibernate.lambda.core.LambdaCriteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wq on 2017/3/23.
 */
@Service
public class LambdaQueryTool {
    @Autowired
    SessionFactory sessionFactory;

    public <T> LambdaCriteria<T> query(Class<T> tClass) {
        return new LambdaCriteria<T>(tClass, sessionFactory.getCurrentSession());
    }
}