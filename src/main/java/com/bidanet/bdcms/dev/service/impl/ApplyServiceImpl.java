package com.bidanet.bdcms.dev.service.impl;


import com.bidanet.bdcms.core.dao.Dao;
import com.bidanet.bdcms.core.service.impl.BaseServiceImpl;
import com.bidanet.bdcms.core.vo.Page;
import com.bidanet.bdcms.dev.dao.ApplyDao;
import com.bidanet.bdcms.dev.entity.Apply;
import com.bidanet.bdcms.dev.service.ApplyService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
*
*/
@Service
public class ApplyServiceImpl extends BaseServiceImpl<Apply> implements ApplyService {
    @Autowired
    private ApplyDao dao;
    @Override
    protected Dao getDao() {
        return dao;
    }

    @Override
    public void findApplyByquery(Apply query, Page<Apply> page) {
        List list = dao.findByExampleEq(query,page.getPageCurrent(),page.getPageSize(), Order.desc("id"));
        long count = dao.countByExampleEq(query);
        page.setTotal(count);
        page.setList(list);

    }

    @Override
    public void findApplyByLambda(Apply query, Page<Apply> page) {

    }
}
