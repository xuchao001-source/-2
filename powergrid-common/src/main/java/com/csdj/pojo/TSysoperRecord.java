package com.csdj.pojo;

import java.util.Date;

public class TSysoperRecord {
    private  Integer tsid;
    private  Integer tsunitid;
    private  String tsunitname;
    private  Integer tsoperid;
    private  String tsopername;
    private Date tstime;
    private  String tscontent;
    private  Integer tslvl;

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

    public Integer getTsunitid() {
        return tsunitid;
    }

    public void setTsunitid(Integer tsunitid) {
        this.tsunitid = tsunitid;
    }

    public String getTsunitname() {
        return tsunitname;
    }

    public void setTsunitname(String tsunitname) {
        this.tsunitname = tsunitname;
    }

    public Integer getTsoperid() {
        return tsoperid;
    }

    public void setTsoperid(Integer tsoperid) {
        this.tsoperid = tsoperid;
    }

    public String getTsopername() {
        return tsopername;
    }

    public void setTsopername(String tsopername) {
        this.tsopername = tsopername;
    }

    public Date getTstime() {
        return tstime;
    }

    public void setTstime(Date tstime) {
        this.tstime = tstime;
    }

    public String getTscontent() {
        return tscontent;
    }

    public void setTscontent(String tscontent) {
        this.tscontent = tscontent;
    }

    public Integer getTslvl() {
        return tslvl;
    }

    public void setTslvl(Integer tslvl) {
        this.tslvl = tslvl;
    }
}
