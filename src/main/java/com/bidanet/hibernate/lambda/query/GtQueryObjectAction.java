package com.bidanet.hibernate.lambda.query;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * 等号 查询实现
 */
public class GtQueryObjectAction<T> extends AbsQueryObjectAction<T> {
    public GtQueryObjectAction(Class<T> zclass) {
        super(zclass);
    }

    @Override
    protected Criterion createCriterion(String key, Object val) {
        return Restrictions.gt(key,val);
//        return ;
    }
}
