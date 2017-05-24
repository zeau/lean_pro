package com.bidanet.bdcms.dev.entity;


import com.bidanet.bdcms.dev.entity.entityEnum.CheckStatus;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by wq on 2017/2/17.
 * 消息通知表
 */
@Entity
@Table(name = "_notice")
public class Notice {

    private Long id;

    private Long userId;            //用户Id

    private String noticeText;      //通知内容

    private CheckStatus checkStatus;//读取状态

    private Long createTime;        //创建时间

    private User user;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getUserId() {
        return userId;
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

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "notice_text")
    public String getNoticeText() {
        return noticeText;
    }

    public void setNoticeText(String noticeText) {
        this.noticeText = noticeText;
    }

    @Column(name = "check_status")
    public CheckStatus getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(CheckStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
