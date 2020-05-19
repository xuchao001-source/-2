package com.csdj.pojo;

import java.util.Date;

/**
 * 掌机登录日志表
 */
public class TTerminalLoginLog {
    private  Integer tllid;
    private  Integer tllseccardid;
    private  Integer tllbizcarid;
    private Integer tllrovderno;
    private  Integer  tllterminaltype;
    private  Integer  tllterminalhardver;
    private  Integer tllsofversion;
    private  String  tllterminalsn;
    private Date tlltime;
    private  String  tllip;

    public Integer getTllid() {
        return tllid;
    }

    public void setTllid(Integer tllid) {
        this.tllid = tllid;
    }

    public Integer getTllseccardid() {
        return tllseccardid;
    }

    public void setTllseccardid(Integer tllseccardid) {
        this.tllseccardid = tllseccardid;
    }

    public Integer getTllbizcarid() {
        return tllbizcarid;
    }

    public void setTllbizcarid(Integer tllbizcarid) {
        this.tllbizcarid = tllbizcarid;
    }

    public Integer getTllrovderno() {
        return tllrovderno;
    }

    public void setTllrovderno(Integer tllrovderno) {
        this.tllrovderno = tllrovderno;
    }

    public Integer getTllterminaltype() {
        return tllterminaltype;
    }

    public void setTllterminaltype(Integer tllterminaltype) {
        this.tllterminaltype = tllterminaltype;
    }

    public Integer getTllterminalhardver() {
        return tllterminalhardver;
    }

    public void setTllterminalhardver(Integer tllterminalhardver) {
        this.tllterminalhardver = tllterminalhardver;
    }

    public Integer getTllsofversion() {
        return tllsofversion;
    }

    public void setTllsofversion(Integer tllsofversion) {
        this.tllsofversion = tllsofversion;
    }

    public String getTllterminalsn() {
        return tllterminalsn;
    }

    public void setTllterminalsn(String tllterminalsn) {
        this.tllterminalsn = tllterminalsn;
    }

    public Date getTlltime() {
        return tlltime;
    }

    public void setTlltime(Date tlltime) {
        this.tlltime = tlltime;
    }

    public String getTllip() {
        return tllip;
    }

    public void setTllip(String tllip) {
        this.tllip = tllip;
    }

    @Override
    public String toString() {
        return "TTerminalLoginLog{" +
                "tllid=" + tllid +
                ", tllseccardid=" + tllseccardid +
                ", tllbizcarid=" + tllbizcarid +
                ", tllrovderno=" + tllrovderno +
                ", tllterminaltype=" + tllterminaltype +
                ", tllterminalhardver=" + tllterminalhardver +
                ", tllsofversion=" + tllsofversion +
                ", tllterminalsn='" + tllterminalsn + '\'' +
                ", tlltime=" + tlltime +
                ", tllip='" + tllip + '\'' +
                '}';
    }
}
