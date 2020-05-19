package com.csdj.pojo;

import java.util.Date;

/**
 *
 * 装换单号总表
 */
public class TCMApp {
    private Integer id;
    private String name;
    private Integer  appid;
    private String appno;
    private Integer operid;
    private String  opername;
    private Integer  unitid;
    private String  unitname;
    private Integer  templateid;
    private String  templatename;
    private Integer status;
    private Integer extend;
    private Date  createtime;
    private Date  deadtime;
    private Integer  revisestatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public Integer getOperid() {
        return operid;
    }

    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getExtend() {
        return extend;
    }

    public void setExtend(Integer extend) {
        this.extend = extend;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeadtime() {
        return deadtime;
    }

    public void setDeadtime(Date deadtime) {
        this.deadtime = deadtime;
    }

    public Integer getRevisestatus() {
        return revisestatus;
    }

    public void setRevisestatus(Integer revisestatus) {
        this.revisestatus = revisestatus;
    }

    @Override
    public String toString() {
        return "TCMApp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appid=" + appid +
                ", appno='" + appno + '\'' +
                ", operid=" + operid +
                ", opername='" + opername + '\'' +
                ", unitid=" + unitid +
                ", unitname='" + unitname + '\'' +
                ", templateid=" + templateid +
                ", templatename='" + templatename + '\'' +
                ", status=" + status +
                ", extend=" + extend +
                ", createtime=" + createtime +
                ", deadtime=" + deadtime +
                ", revisestatus=" + revisestatus +
                '}';
    }
}
