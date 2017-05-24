package com.bidanet.hibernate.lambda.query;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * Created by xuejike on 2017/3/10.
 */
public class LtQueryObjectAction<T> extends AbsQueryObjectAction<T> {
    public LtQueryObjectAction(Class<T> zclass) {
        super(zclass);
    }

    @Override
    protected Criterion createCriterion(String key, Object val) {
        return Restrictions.lt(key, val);
    }
}
