package com.bidanet.bdcms.dev.entity;



import com.bidanet.bdcms.dev.entity.entityEnum.CheckStatus;
import com.bidanet.bdcms.dev.entity.entityEnum.Status;

import javax.persistence.*;

/**
 * Created by wq on 2017/2/17.
 * 推广表
 */

@Entity
@Table(name = "_popularize")
public class Popularize {

    private  Long id;

    private String userName;

    private Long createTime;

    private CheckStatus checkStatus;  //处理状态

    private String password;

    private Status status;

    private String mobile;

    private String userType;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Column(name = "check_status")
    public CheckStatus getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(CheckStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
