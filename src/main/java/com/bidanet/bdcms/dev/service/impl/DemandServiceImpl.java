package com.bidanet.bdcms.dev.service.impl;

import com.bidanet.bdcms.core.dao.Dao;
import com.bidanet.bdcms.core.service.impl.BaseServiceImpl;
import com.bidanet.bdcms.dev.dao.DemandDao;
import com.bidanet.bdcms.dev.entity.Demand;
import com.bidanet.bdcms.dev.service.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
*
*/
@Service
public class DemandServiceImpl extends BaseServiceImpl<Demand> implements DemandService {
    @Autowired
    private DemandDao dao;
    @Override
    protected Dao getDao() {
        return dao;
    }


}
