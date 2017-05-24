package com.bidanet.bdcms.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yf003 on 2017/2/10.
 */
@Controller
public class TestController {


    @RequestMapping("/index")
    public void index(){

        System.out.println("`11");
    }


    @RequestMapping("/admin/index")
    public void test(){

        System.out.println("`11");
    }

}
