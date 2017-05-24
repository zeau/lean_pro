package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/2.
 */
public enum InterestType {
    luntan,
    xinmeiti,
    hangye,
    biaogan,
    huiyuan,
    qita;

    public String cn(){

        switch (this){
            case luntan: return "论坛及研讨会";
            case xinmeiti:return "新媒体信息推送";
            case  hangye:return "行业推送";
            case biaogan:return "标杆企业参观";
            case huiyuan:return "会员各式非正式运动聚会";
            case qita:return "其他";
            default:return "非法状态！";

        }


    }


}
