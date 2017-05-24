package com.bidanet.bdcms.dev.controller.admin;

import com.bidanet.bdcms.core.bean.ApiResult;
import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.core.common.EntityTool;
import com.bidanet.bdcms.core.vo.Page;
import com.bidanet.bdcms.dev.entity.Demand;
import com.bidanet.bdcms.dev.entityVo.DemandVo;
import com.bidanet.bdcms.dev.service.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wq on 2017/2/24.
 * 需求的控制层
 */

@Controller
@RequestMapping("/admin/demand")
public class DemandController {


    @Autowired
    private DemandService demandService;

    @RequestMapping("/findDemands")
    @ResponseBody
    public ApiResult<Page> findDemands(Page<Demand> page, Demand demand){

         demandService.getPageByExampleEq(demand,page);
        Page<EntityToVo> applyPage=new EntityTool().getPageEntityToVo(DemandVo.class,page);
        return ApiResult.success(applyPage);

    }
    @RequestMapping("/getDemand")
    @ResponseBody
    public ApiResult<Demand> getDemand(Long id){

        if(id!=null){
           Demand demand = demandService.get(id);
            return ApiResult.success(demand);
        }
        return ApiResult.error("id不存在，查询错误");

    }






}
