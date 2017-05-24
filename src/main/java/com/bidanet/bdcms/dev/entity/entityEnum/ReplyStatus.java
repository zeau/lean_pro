package com.bidanet.bdcms.dev.entity.entityEnum;

/**
 * Created by wq on 2017/3/6.
 */
public enum  ReplyStatus {

     noreply,//未回复
      reply;//已回复

    public String cn(){
        switch (this){
            case noreply: return "未回复";
            case reply: return "已回复";
            default:return "非法状态";

        }


    }


}
