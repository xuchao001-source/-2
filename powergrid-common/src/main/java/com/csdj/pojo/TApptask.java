package com.csdj.pojo;

import java.util.Date;

public class TApptask {
    private  Integer tid;
    private  String appno;
    private  Integer unitid;
    private  String unitname;
    private  Integer operid;
    private  String opername;
    private  Integer temid;
    private  String temtitle;
    private Date subtime;
    private  Integer manageid;
    private  String managername;
    private  Date sptime;
    private   Integer status;
    private  String memo;
    private  Integer taskid;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
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

    public Integer getTemid() {
        return temid;
    }

    public void setTemid(Integer temid) {
        this.temid = temid;
    }

    public String getTemtitle() {
        return temtitle;
    }

    public void setTemtitle(String temtitle) {
        this.temtitle = temtitle;
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }

    public Integer getManageid() {
        return manageid;
    }

    public void setManageid(Integer manageid) {
        this.manageid = manageid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public Date getSptime() {
        return sptime;
    }

    public void setSptime(Date sptime) {
        this.sptime = sptime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
