package com.csdj.pojo;

import java.util.Date;

/**
 * 掌机软件包表
 */
public class TTerminalSoftware {
    private  Integer tsid;
    private  Integer tstype;
    private  Integer tsoptionflag;
    private  Integer  tsversionno;
    private  Integer tsprovider;
    private  String tsversionname;
    private Date  tsupladdate;
    private  String  tspackagdata;
private  String  tsmd5;
private  String tsmemo;
private  Integer tsstatus;

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

    public Integer getTstype() {
        return tstype;
    }

    public void setTstype(Integer tstype) {
        this.tstype = tstype;
    }

    public Integer getTsoptionflag() {
        return tsoptionflag;
    }

    public void setTsoptionflag(Integer tsoptionflag) {
        this.tsoptionflag = tsoptionflag;
    }

    public Integer getTsversionno() {
        return tsversionno;
    }

    public void setTsversionno(Integer tsversionno) {
        this.tsversionno = tsversionno;
    }

    public Integer getTsprovider() {
        return tsprovider;
    }

    public void setTsprovider(Integer tsprovider) {
        this.tsprovider = tsprovider;
    }

    public String getTsversionname() {
        return tsversionname;
    }

    public void setTsversionname(String tsversionname) {
        this.tsversionname = tsversionname;
    }

    public Date getTsupladdate() {
        return tsupladdate;
    }

    public void setTsupladdate(Date tsupladdate) {
        this.tsupladdate = tsupladdate;
    }

    public String getTspackagdata() {
        return tspackagdata;
    }

    public void setTspackagdata(String tspackagdata) {
        this.tspackagdata = tspackagdata;
    }

    public String getTsmd5() {
        return tsmd5;
    }

    public void setTsmd5(String tsmd5) {
        this.tsmd5 = tsmd5;
    }

    public String getTsmemo() {
        return tsmemo;
    }

    public void setTsmemo(String tsmemo) {
        this.tsmemo = tsmemo;
    }

    public Integer getTsstatus() {
        return tsstatus;
    }

    public void setTsstatus(Integer tsstatus) {
        this.tsstatus = tsstatus;
    }

    @Override
    public String toString() {
        return "T_TerminalSoftware{" +
                "tsid=" + tsid +
                ", tstype=" + tstype +
                ", tsoptionflag=" + tsoptionflag +
                ", tsversionno=" + tsversionno +
                ", tsprovider=" + tsprovider +
                ", tsversionname='" + tsversionname + '\'' +
                ", tsupladdate=" + tsupladdate +
                ", tspackagdata='" + tspackagdata + '\'' +
                ", tsmd5='" + tsmd5 + '\'' +
                ", tsmemo='" + tsmemo + '\'' +
                ", tsstatus=" + tsstatus +
                '}';
    }
}
