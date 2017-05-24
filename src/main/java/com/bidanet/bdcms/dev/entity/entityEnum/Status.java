package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by asus on 2016/10/26.
 */
public enum Status {
    disable,enable;



    public String cn(){
        switch (this){
            case disable:
                return "禁用";
            case enable:
                return "启用";
            default:
                return "非法状态";
        }
    }
}
