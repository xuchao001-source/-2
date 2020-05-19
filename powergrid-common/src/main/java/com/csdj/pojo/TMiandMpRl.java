package com.csdj.pojo;

import java.util.Date;

/**
 * 装换计量点和互感器关系
 */
public class TMiandMpRl {
    private Integer  miid;
    private Integer  cmid;
    private Integer  custid;
    private Integer  consid;
    private String   consno;
    private Integer mirschemeid;
    private Integer  mpschemeid;
    private String  chgdesc;
    private Integer itschemeid;
    private String  appno;
    private Integer appid;
    private Integer tiid;
    private Date  operatetime;
    private String  voltratiocode;
    private String  currentratiocode;

    public Integer getMiid() {
        return miid;
    }

    public void setMiid(Integer miid) {
        this.miid = miid;
    }

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getConsid() {
        return consid;
    }

    public void setConsid(Integer consid) {
        this.consid = consid;
    }

    public String getConsno() {
        return consno;
    }

    public void setConsno(String consno) {
        this.consno = consno;
    }

    public Integer getMirschemeid() {
        return mirschemeid;
    }

    public void setMirschemeid(Integer mirschemeid) {
        this.mirschemeid = mirschemeid;
    }

    public Integer getMpschemeid() {
        return mpschemeid;
    }

    public void setMpschemeid(Integer mpschemeid) {
        this.mpschemeid = mpschemeid;
    }

    public String getChgdesc() {
        return chgdesc;
    }

    public void setChgdesc(String chgdesc) {
        this.chgdesc = chgdesc;
    }

    public Integer getItschemeid() {
        return itschemeid;
    }

    public void setItschemeid(Integer itschemeid) {
        this.itschemeid = itschemeid;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getTiid() {
        return tiid;
    }

    public void setTiid(Integer tiid) {
        this.tiid = tiid;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public String getVoltratiocode() {
        return voltratiocode;
    }

    public void setVoltratiocode(String voltratiocode) {
        this.voltratiocode = voltratiocode;
    }

    public String getCurrentratiocode() {
        return currentratiocode;
    }

    public void setCurrentratiocode(String currentratiocode) {
        this.currentratiocode = currentratiocode;
    }

    @Override
    public String toString() {
        return "TMiandMpRl{" +
                "miid=" + miid +
                ", cmid=" + cmid +
                ", custid=" + custid +
                ", consid=" + consid +
                ", consno='" + consno + '\'' +
                ", mirschemeid=" + mirschemeid +
                ", mpschemeid=" + mpschemeid +
                ", chgdesc='" + chgdesc + '\'' +
                ", itschemeid=" + itschemeid +
                ", appno='" + appno + '\'' +
                ", appid=" + appid +
                ", tiid=" + tiid +
                ", operatetime=" + operatetime +
                ", voltratiocode='" + voltratiocode + '\'' +
                ", currentratiocode='" + currentratiocode + '\'' +
                '}';
    }
}
