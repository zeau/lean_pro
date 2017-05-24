package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by asus on 2016/10/26.
 */
public enum Sex {
    man,woman;


    public String cn(){
        switch (this){
            case man:
                return "男";
            case woman:
                return "女";
            default:
                return "非法状态";
        }
    }





}
