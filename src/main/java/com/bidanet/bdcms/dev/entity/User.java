package com.bidanet.bdcms.dev.entity;



import com.bidanet.bdcms.dev.entity.entityEnum.Status;
import com.bidanet.bdcms.dev.entity.entityEnum.UserType;

import javax.persistence.*;

/**
 * Created by yf003 on 2017/2/10.
 */
@Entity
@Table(name = "_user")
public class User {

    private Long id;

    private Long applyId;//会员id

    private String name;

    private String mobile;

    private String password;

    private Long createTime;

    private UserType userType;

    protected String salt; //加密密码的盐

    private Status status;//是否查看

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="apply_id")
    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    @Column(name="mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Column(name="create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Column(name="status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Column(name = "user_type")
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
