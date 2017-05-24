package com.bidanet.bdcms.dev.service.impl;


import com.bidanet.bdcms.core.dao.Dao;
import com.bidanet.bdcms.core.service.impl.BaseServiceImpl;
import com.bidanet.bdcms.dev.dao.PopularizeDao;
import com.bidanet.bdcms.dev.entity.Popularize;
import com.bidanet.bdcms.dev.service.PopularizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
*
*/
@Service
public class PopularizeServiceImpl extends BaseServiceImpl<Popularize> implements PopularizeService {
    @Autowired
    private PopularizeDao dao;
    @Override
    protected Dao getDao() {
        return dao;
    }


}
