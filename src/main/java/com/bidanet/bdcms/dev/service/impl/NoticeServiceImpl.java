package com.bidanet.bdcms.dev.service.impl;


import com.bidanet.bdcms.core.dao.Dao;
import com.bidanet.bdcms.core.service.impl.BaseServiceImpl;
import com.bidanet.bdcms.dev.dao.NoticeDao;
import com.bidanet.bdcms.dev.entity.Notice;
import com.bidanet.bdcms.dev.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
*
*/
@Service
public class NoticeServiceImpl extends BaseServiceImpl<Notice> implements NoticeService {
    @Autowired
    private NoticeDao dao;
    @Override
    protected Dao getDao() {
        return dao;
    }


}
