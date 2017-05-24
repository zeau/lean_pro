package com.bidanet.bdcms.dev.entity;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by wq on 2017/2/17.
 * 需求表
 */
@Entity
@Table(name = "_demand")
public class Demand {


    private Long id;

    private String demand;  //需求

    private String reply;   //回复

    private User user;   //用户

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "demand")
    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    @Column(name = "reply")
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
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
}
