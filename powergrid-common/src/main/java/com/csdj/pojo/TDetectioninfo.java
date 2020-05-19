package com.csdj.pojo;

import java.util.Date;

/**
 * 集中器检测日志信息
 */
public class TDetectioninfo {
    private Integer  tdid;
    private Integer tdoperator;
    private String  tdaccount;
    private Integer  tdmanageunit;
    private Integer tdterminaltype;
    private String tdterminalno;
    private String  tdmeterno;
    private Date  tdtime;
    private Integer tdresult;
    private String tdfalreason;
    private Integer  tdmethod;
    private String  tdmemo;
    private Integer TD_IDs;
    private Integer tdoperators;
    private String  tdaccounts;

    public Integer getTdid() {
        return tdid;
    }

    public void setTdid(Integer tdid) {
        this.tdid = tdid;
    }

    public Integer getTdoperator() {
        return tdoperator;
    }

    public void setTdoperator(Integer tdoperator) {
        this.tdoperator = tdoperator;
    }

    public String getTdaccount() {
        return tdaccount;
    }

    public void setTdaccount(String tdaccount) {
        this.tdaccount = tdaccount;
    }

    public Integer getTdmanageunit() {
        return tdmanageunit;
    }

    public void setTdmanageunit(Integer tdmanageunit) {
        this.tdmanageunit = tdmanageunit;
    }

    public Integer getTdterminaltype() {
        return tdterminaltype;
    }

    public void setTdterminaltype(Integer tdterminaltype) {
        this.tdterminaltype = tdterminaltype;
    }

    public String getTdterminalno() {
        return tdterminalno;
    }

    public void setTdterminalno(String tdterminalno) {
        this.tdterminalno = tdterminalno;
    }

    public String getTdmeterno() {
        return tdmeterno;
    }

    public void setTdmeterno(String tdmeterno) {
        this.tdmeterno = tdmeterno;
    }

    public Date getTdtime() {
        return tdtime;
    }

    public void setTdtime(Date tdtime) {
        this.tdtime = tdtime;
    }

    public Integer getTdresult() {
        return tdresult;
    }

    public void setTdresult(Integer tdresult) {
        this.tdresult = tdresult;
    }

    public String getTdfalreason() {
        return tdfalreason;
    }

    public void setTdfalreason(String tdfalreason) {
        this.tdfalreason = tdfalreason;
    }

    public Integer getTdmethod() {
        return tdmethod;
    }

    public void setTdmethod(Integer tdmethod) {
        this.tdmethod = tdmethod;
    }

    public String getTdmemo() {
        return tdmemo;
    }

    public void setTdmemo(String tdmemo) {
        this.tdmemo = tdmemo;
    }

    public Integer getTD_IDs() {
        return TD_IDs;
    }

    public void setTD_IDs(Integer TD_IDs) {
        this.TD_IDs = TD_IDs;
    }

    public Integer getTdoperators() {
        return tdoperators;
    }

    public void setTdoperators(Integer tdoperators) {
        this.tdoperators = tdoperators;
    }

    public String getTdaccounts() {
        return tdaccounts;
    }

    public void setTdaccounts(String tdaccounts) {
        this.tdaccounts = tdaccounts;
    }

    @Override
    public String toString() {
        return "T_Detectioninfo{" +
                "tdid=" + tdid +
                ", tdoperator=" + tdoperator +
                ", tdaccount='" + tdaccount + '\'' +
                ", tdmanageunit=" + tdmanageunit +
                ", tdterminaltype=" + tdterminaltype +
                ", tdterminalno='" + tdterminalno + '\'' +
                ", tdmeterno='" + tdmeterno + '\'' +
                ", tdtime=" + tdtime +
                ", tdresult=" + tdresult +
                ", tdfalreason='" + tdfalreason + '\'' +
                ", tdmethod=" + tdmethod +
                ", tdmemo='" + tdmemo + '\'' +
                ", TD_IDs=" + TD_IDs +
                ", tdoperators=" + tdoperators +
                ", tdaccounts='" + tdaccounts + '\'' +
                '}';
    }
}
