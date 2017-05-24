package com.bidanet.bdcms.dev.controller.admin;


import com.bidanet.bdcms.core.bean.ApiResult;
import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.core.common.EntityTool;
import com.bidanet.bdcms.core.vo.Page;
import com.bidanet.bdcms.dev.dao.UserDao;
import com.bidanet.bdcms.dev.entity.Apply;
import com.bidanet.bdcms.dev.entity.entityEnum.ApplyStatus;
import com.bidanet.bdcms.dev.entityVo.ApplyVo;
import com.bidanet.bdcms.dev.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by wq on 2017/2/21.
 * 会员申请
 */
@Controller
@RequestMapping("/admin/apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/findApplyList")
    @ResponseBody
    public ApiResult<Page> findApplyList(Page<Apply> page, Apply query){

       applyService.findApplyByquery(query,page);

        Page<EntityToVo> applyPage=new EntityTool().getPageEntityToVo(ApplyVo.class,page);

        return ApiResult.success(applyPage);
    }
    @RequestMapping("/getApply")
    @ResponseBody
    public ApiResult<Apply> getApply(Long id){

        if(id!=null){
            Apply apply = applyService.get(id);
            return ApiResult.success(apply);
        }

       return ApiResult.error("参数为空！");


    }
    @RequestMapping("/updateApply")
    @ResponseBody
    public ApiResult<Apply> updateApply(Long id,String status){

        if(id!=null){
            Apply apply = applyService.get(id);
            if(status.equals("pass")){

                apply.setApplyStatus(ApplyStatus.pass);

            }
            if(status.equals("nopass")){

                apply.setApplyStatus(ApplyStatus.nopass);

            }
            applyService.updateT(apply);

            return ApiResult.success(apply);
        }

       return ApiResult.error("参数为空！");


    }



}
