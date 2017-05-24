package com.bidanet.bdcms.dev.service;


import com.bidanet.bdcms.core.service.Service;
import com.bidanet.bdcms.core.vo.Page;
import com.bidanet.bdcms.dev.entity.Apply;

/**
*
*/
public interface ApplyService extends Service<Apply> {

    void findApplyByquery(Apply query, Page<Apply> page);
    void findApplyByLambda(Apply query, Page<Apply> page);

}
