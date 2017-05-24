package com.bidanet.bdcms.dev.controller.admin;


import com.bidanet.bdcms.core.bean.ApiResult;
import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.core.common.EntityTool;
import com.bidanet.bdcms.core.vo.Page;
import com.bidanet.bdcms.dev.entity.User;
import com.bidanet.bdcms.dev.entityVo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wq on 2017/2/21.
 * 基础用户
 */

@Controller
@RequestMapping("/admin/baseUser")
public class BaseUserController {

/*    @Autowired
    private UserService userService;

    @RequestMapping("/findUserList")
    @ResponseBody
    public ApiResult<Page> findUserList(Page<User> page, User query){

        userService.findUserByquery(query,page);

        Page<EntityToVo> userPage=new EntityTool().getPageEntityToVo(UserVo.class,page);

        return ApiResult.success(userPage);

    }*/

}
