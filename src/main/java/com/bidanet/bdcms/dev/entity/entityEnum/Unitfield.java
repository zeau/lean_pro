package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/2.
 */
public enum Unitfield {

    zhizaoye,//制造业
    zidonghua,//自动化
    zixun,//咨询
    ruanjian,//软件供应
    gongye,//工业工程
    RFID,//RFID厂商
    qita;//其他


    public String cn() {
        switch (this) {
            case zhizaoye:
                return "制造业";
            case zidonghua:
                return "自动化设备供应商";
            case zixun:
                return "咨询";
            case ruanjian:
                return "软件供应商";
            case gongye:
                return "工业工程服务商";
            case RFID:
                return "RFID厂商";
            case qita:
                return "其他";

            default:
                return "非法状态";
        }
    }





}
