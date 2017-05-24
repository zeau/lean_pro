package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/2.
 */
public enum ApplyType {

    zizaoye,
    fuwuye,
    geren,
    shiyong,
    fhz,
    lsh;

    public String cn(){

        switch (this){
            case zizaoye: return "制造业企业会员";
            case fuwuye: return "服务商企业";
            case geren: return "个人会员";
            case shiyong: return "试用会员";
            case fhz: return "副会长单位会员";
            case lsh: return "理事单位会员";
            default:return "非法状态";
        }
    }
}
