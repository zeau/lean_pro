package com.bidanet.bdcms.dev.entity;


import com.bidanet.bdcms.dev.entity.entityEnum.ApplyStatus;
import com.bidanet.bdcms.dev.entity.entityEnum.Sex;
import com.bidanet.bdcms.dev.entity.entityEnum.Status;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by wq on 2017/2/17.
 * 会员申请表
 */

@Entity
@Table(name = "_apply")
public class Apply {

    private Long id;

    private Long applyTime;     //申请时间


    private ApplyStatus applyStatus;//审核状态

    private Status status;          //状态

    private User user;


    //以下为日常联系人信息

    private String dailyName;
    private Sex dailySex;
    private String dailyPosition;   //日常联系人职务
    private String dailyTitle;      //日常联系人职称
    private String dailyPhone;      //日常联系人办公电话
    private String dailyMobile;     //日常联系人手机号码
    private String dailyFax;        //日常联系人传真
    private String dailyMailbox;    //日常联系人电子邮箱
    private String dailyWechat;     //日常联系人微信号


    //IT部门负责人

    private String ITname;
    private Sex  ITsex;
    private String ITposition;     //IT部门负责人职务
    private String ITtitle  ;      //IT部门负责人职称
    private String ITphone  ;      //IT部门负责人办公电话
    private String ITmobile;       //IT部门负责人手机号
    private String ITfax;          //IT部门负责人传真
    private String ITmaibox;       //IT部门负责人邮箱
    private String ITwechat;       //IT部门负责人微信号
    private String interest;       //感兴趣的活动






    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "apply_time")
    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    @Column(name = "apply_status")
    public ApplyStatus getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(ApplyStatus applyStatus) {
        this.applyStatus = applyStatus;
    }

    @Column(name = "status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Column(name = "daily_name")
    public String getDailyName() {
        return dailyName;
    }

    public void setDailyName(String dailyName) {
        this.dailyName = dailyName;
    }

    @Column(name = "daily_sex")
    public Sex getDailySex() {
        return dailySex;
    }

    public void setDailySex(Sex dailySex) {
        this.dailySex = dailySex;
    }

    @Column(name = "daily_position")
    public String getDailyPosition() {
        return dailyPosition;
    }

    public void setDailyPosition(String dailyPosition) {
        this.dailyPosition = dailyPosition;
    }

    @Column(name = "daily_title")
    public String getDailyTitle() {
        return dailyTitle;
    }

    public void setDailyTitle(String dailyTitle) {
        this.dailyTitle = dailyTitle;
    }

    @Column(name = "daily_phone")
    public String getDailyPhone() {
        return dailyPhone;
    }

    public void setDailyPhone(String dailyPhone) {
        this.dailyPhone = dailyPhone;
    }

    @Column(name = "daily_mobile")
    public String getDailyMobile() {
        return dailyMobile;
    }

    public void setDailyMobile(String dailyMobile) {
        this.dailyMobile = dailyMobile;
    }

    @Column(name = "daily_fax")
    public String getDailyFax() {
        return dailyFax;
    }

    public void setDailyFax(String dailyFax) {
        this.dailyFax = dailyFax;
    }

    @Column(name = "daily_mailbox")
    public String getDailyMailbox() {
        return dailyMailbox;
    }

    public void setDailyMailbox(String dailyMailbox) {
        this.dailyMailbox = dailyMailbox;
    }


    @Column(name = "daily_wechat")
    public String getDailyWechat() {
        return dailyWechat;
    }

    public void setDailyWechat(String dailyWechat) {
        this.dailyWechat = dailyWechat;
    }

    @Column(name = "IT_name")
    public String getITname() {
        return ITname;
    }

    public void setITname(String ITname) {
        this.ITname = ITname;
    }

    @Column(name = "IT_sex")
    public Sex getITsex() {
        return ITsex;
    }

    public void setITsex(Sex ITsex) {
        this.ITsex = ITsex;
    }

    @Column(name = "IT_position")
    public String getITposition() {
        return ITposition;
    }

    public void setITposition(String ITposition) {
        this.ITposition = ITposition;
    }

    @Column(name = "IT_title")
    public String getITtitle() {
        return ITtitle;
    }

    public void setITtitle(String ITtitle) {
        this.ITtitle = ITtitle;
    }

    @Column(name = "IT_phone")
    public String getITphone() {
        return ITphone;
    }

    public void setITphone(String ITphone) {
        this.ITphone = ITphone;
    }

    @Column(name = "IT_mobile")
    public String getITmobile() {
        return ITmobile;
    }

    public void setITmobile(String ITmobile) {
        this.ITmobile = ITmobile;
    }

    @Column(name = "IT_fax")
    public String getITfax() {
        return ITfax;
    }

    public void setITfax(String ITfax) {
        this.ITfax = ITfax;
    }

    @Column(name = "IT_maibox")
    public String getITmaibox() {
        return ITmaibox;
    }

    public void setITmaibox(String ITmaibox) {
        this.ITmaibox = ITmaibox;
    }

    @Column(name = "IT_wechat")
    public String getITwechat() {
        return ITwechat;
    }

    public void setITwechat(String ITwechat) {
        this.ITwechat = ITwechat;
    }

    @Column(name = "interest")
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
