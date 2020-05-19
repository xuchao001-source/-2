package com.csdj.pojo;

import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * 装换计量点和电能关系表
 */
public class TMpandMeterRl {
    private Integer  mpid;
    private Integer  cmid;
    private String  appno;
    private Integer appid;
    private Integer sustid;
    private Integer consid;
    private String consno;
    private Integer mmrschemeid;
    private Integer mpschemeid;
    private String  chgdesc;
    private Integer  meterschemeid;
    private String  sortcode;
    private String typecode;
    private String  prepayflag;
    private String  historyetcdata;
    private String mpmdata;
    private Date  setdate;
    private Integer residualamount;
    private String resultmpmdata;
    private Integer  pricecompaeid;
    private Integer setpricetemid;
    private Integer meterid;
    private Integer  tfactor;

    public Integer getMpid() {
        return mpid;
    }

    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
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

    public Integer getSustid() {
        return sustid;
    }

    public void setSustid(Integer sustid) {
        this.sustid = sustid;
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

    public Integer getMmrschemeid() {
        return mmrschemeid;
    }

    public void setMmrschemeid(Integer mmrschemeid) {
        this.mmrschemeid = mmrschemeid;
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

    public Integer getMeterschemeid() {
        return meterschemeid;
    }

    public void setMeterschemeid(Integer meterschemeid) {
        this.meterschemeid = meterschemeid;
    }

    public String getSortcode() {
        return sortcode;
    }

    public void setSortcode(String sortcode) {
        this.sortcode = sortcode;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getPrepayflag() {
        return prepayflag;
    }

    public void setPrepayflag(String prepayflag) {
        this.prepayflag = prepayflag;
    }

    public String getHistoryetcdata() {
        return historyetcdata;
    }

    public void setHistoryetcdata(String historyetcdata) {
        this.historyetcdata = historyetcdata;
    }

    public String getMpmdata() {
        return mpmdata;
    }

    public void setMpmdata(String mpmdata) {
        this.mpmdata = mpmdata;
    }

    public Date getSetdate() {
        return setdate;
    }

    public void setSetdate(Date setdate) {
        this.setdate = setdate;
    }

    public Integer getResidualamount() {
        return residualamount;
    }

    public void setResidualamount(Integer residualamount) {
        this.residualamount = residualamount;
    }

    public String getResultmpmdata() {
        return resultmpmdata;
    }

    public void setResultmpmdata(String resultmpmdata) {
        this.resultmpmdata = resultmpmdata;
    }

    public Integer getPricecompaeid() {
        return pricecompaeid;
    }

    public void setPricecompaeid(Integer pricecompaeid) {
        this.pricecompaeid = pricecompaeid;
    }

    public Integer getSetpricetemid() {
        return setpricetemid;
    }

    public void setSetpricetemid(Integer setpricetemid) {
        this.setpricetemid = setpricetemid;
    }

    public Integer getMeterid() {
        return meterid;
    }

    public void setMeterid(Integer meterid) {
        this.meterid = meterid;
    }

    public Integer getTfactor() {
        return tfactor;
    }

    public void setTfactor(Integer tfactor) {
        this.tfactor = tfactor;
    }

    @Override
    public String toString() {
        return "TMpandMeterRl{" +
                "mpid=" + mpid +
                ", cmid=" + cmid +
                ", appno='" + appno + '\'' +
                ", appid=" + appid +
                ", sustid=" + sustid +
                ", consid=" + consid +
                ", consno='" + consno + '\'' +
                ", mmrschemeid=" + mmrschemeid +
                ", mpschemeid=" + mpschemeid +
                ", chgdesc='" + chgdesc + '\'' +
                ", meterschemeid=" + meterschemeid +
                ", sortcode='" + sortcode + '\'' +
                ", typecode='" + typecode + '\'' +
                ", prepayflag='" + prepayflag + '\'' +
                ", historyetcdata='" + historyetcdata + '\'' +
                ", mpmdata='" + mpmdata + '\'' +
                ", setdate=" + setdate +
                ", residualamount=" + residualamount +
                ", resultmpmdata='" + resultmpmdata + '\'' +
                ", pricecompaeid=" + pricecompaeid +
                ", setpricetemid=" + setpricetemid +
                ", meterid=" + meterid +
                ", tfactor=" + tfactor +
                '}';
    }
}
