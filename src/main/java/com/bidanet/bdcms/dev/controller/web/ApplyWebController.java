package com.bidanet.bdcms.dev.controller.web;

import com.bidanet.bdcms.core.bean.ApiResult;
import com.bidanet.bdcms.dev.entity.Apply;
import com.bidanet.bdcms.dev.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wq on 2017/5/22.
 */
@Controller
@RequestMapping("/web/apply")
public class ApplyWebController  {

    @Autowired
    ApplyService applyService;

    @RequestMapping("/saveApply")
    @ResponseBody
    public ApiResult<String> saveApply(){

        Apply apply = new Apply();
        apply.setDailyName("dddtest");
        applyService.insertT(apply);

        return ApiResult.success("保存成功!");
    }



    @RequestMapping("/findApplyList")
    @ResponseBody
    public ApiResult<Apply> findApplyList(Long id){

       Apply apply = applyService.get(id);

        return ApiResult.success(apply);
    }



}
