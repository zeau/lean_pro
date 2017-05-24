package com.bidanet.bdcms.dev.entityVo;


import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.dev.common.ViewDataBuildTool;

import com.bidanet.bdcms.dev.entity.Demand;

/**
 * Created by wq on 2017/2/24.
 */
public class DemandVo implements EntityToVo {
    protected static ViewDataBuildTool viewDataBuildTool = new ViewDataBuildTool();

    private Long id;

    private String demand;

    private String reply;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }


    @Override
    public void loadData(Object... obj) {
        if (obj != null && obj.length > 0) {
            Demand demand = (Demand) obj[0];
            viewDataBuildTool.createGetSetMapMethod(demand, this);


        }
    }
}