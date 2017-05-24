package com.bidanet.hibernate.lambda.query;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * 等号 查询实现
 */
public class LteQueryObjectAction<T> extends AbsQueryObjectAction<T> {
    public LteQueryObjectAction(Class<T> zclass) {
        super(zclass);
    }

    @Override
    protected Criterion createCriterion(String key, Object val) {
        return Restrictions.le(key,val);
//        return ;
    }
}
