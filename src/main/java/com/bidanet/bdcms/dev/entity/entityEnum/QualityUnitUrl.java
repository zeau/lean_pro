package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/2.
 */
public enum QualityUnitUrl {

    guoying,waiqi,hezi,minying,yuanxiao,
    zfjg,//政府机关
    yjjg,//研究机构
    qita;

    public String cn(){
        switch (this){
            case guoying:
                return "国营";
            case waiqi:
                return "外企";
            case hezi:
                return "合资";
            case minying:
                return "民营";
            case yuanxiao:
                return "院校";
            case zfjg:
                return "政府机关";
            case yjjg:
                return "研究机构";
            case qita:
                return "其他";

            default:
                return "非法状态";
        }
    }



}
