package com.bidanet.bdcms.dev.entity;

import com.bidanet.bdcms.dev.entity.entityEnum.Status;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by asus on 2016/10/26.
 * 基础数据表
 */
@Entity
@Table(name="_basic_data")
public class BasicData {
    private Long id;//编号
    private Long pid; //父节点
    private String type;//分类
    private String name;//名称
    private String val;//值
    private String ext;//扩展
    private Integer showIndex;//排序
    private Boolean isDelete=false;//删除
    private Status status=Status.enable;//状态


    private BasicData basicData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="_pid",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    public BasicData getBasicData() {
        return basicData;
    }

    public void setBasicData(BasicData basicData) {
        this.basicData = basicData;
    }

    @Column(name="_pid")
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="_type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
    @Column(name="_ext")
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Column(name="_show_index")
    public Integer getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Column(name="is_delete")
    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
