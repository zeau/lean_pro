package com.bidanet.bdcms.dev.entityVo;


import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.dev.common.ViewDataBuildTool;
import com.bidanet.bdcms.dev.entity.Apply;
import com.bidanet.bdcms.dev.entity.User;
import com.bidanet.bdcms.dev.entity.entityEnum.ApplyStatus;
import com.bidanet.bdcms.dev.entity.entityEnum.Status;

/**
 * Created by wq on 2017/2/21.
 */
public class ApplyVo implements EntityToVo {

    protected static ViewDataBuildTool viewDataBuildTool=new ViewDataBuildTool();

    private Long id;

    private Long applyTime;     //申请时间

    private ApplyStatus applyStatus;//审核状态

    private Status status;          //状态

    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    public ApplyStatus getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(ApplyStatus applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void loadData(Object... obj) {
        if (obj!=null&&obj.length>0){
            Apply apply = (Apply) obj[0];
            viewDataBuildTool.createGetSetMapMethod(apply, this);

        }

    }


}
