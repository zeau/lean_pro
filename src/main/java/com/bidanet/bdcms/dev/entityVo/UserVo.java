package com.bidanet.bdcms.dev.entityVo;


import com.bidanet.bdcms.core.bean.EntityToVo;
import com.bidanet.bdcms.dev.common.ViewDataBuildTool;
import com.bidanet.bdcms.dev.entity.User;
import com.bidanet.bdcms.dev.entity.entityEnum.Status;

/**
 * Created by wq on 2017/2/21.
 */
public class UserVo implements EntityToVo {

    protected  static ViewDataBuildTool viewDataBuildTool=new ViewDataBuildTool();

    private Long id;

    private Long applyId;//会员id

    private String name;

    private String mobile;

    private Long createTime;

    private Status status;//是否查看

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void loadData(Object... obj) {

        if (obj!=null&&obj.length>0){
            User user = (User) obj[0];
            viewDataBuildTool.createGetSetMapMethod(user, this);

        }
    }
}
