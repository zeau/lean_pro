package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/2.
 */
public enum Specialapply {


    fhz,//副会长
    lsh;//理事会

    public String cn(){

        switch (this) {
            case fhz:
                return "副会长单位会员";
            case lsh:
                return "理事单位会员";
            default:
                return "非法状态";
        }

    }

}
