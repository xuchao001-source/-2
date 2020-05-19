package com.csdj.pojo;

import java.util.Date;

/**
 * 掌机软件包表
 */
public class TTerminalSoftwareItem {
    private  Integer tsiid;
    private  Integer tstype;
    private  Integer  tsoptionfalag;
    private  Integer tsversionno;
    private  Integer tsprovider;
    private  String tsversionname;
    private Date  tsuploaddate;
    private  String  tspackagedata;
    private  String  tsmd5;
    private  String tsmemo;
    private  Integer  ststatus;

    public Integer getTsiid() {
        return tsiid;
    }

    public void setTsiid(Integer tsiid) {
        this.tsiid = tsiid;
    }

    public Integer getTstype() {
        return tstype;
    }

    public void setTstype(Integer tstype) {
        this.tstype = tstype;
    }

    public Integer getTsoptionfalag() {
        return tsoptionfalag;
    }

    public void setTsoptionfalag(Integer tsoptionfalag) {
        this.tsoptionfalag = tsoptionfalag;
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

    public Date getTsuploaddate() {
        return tsuploaddate;
    }

    public void setTsuploaddate(Date tsuploaddate) {
        this.tsuploaddate = tsuploaddate;
    }

    public String getTspackagedata() {
        return tspackagedata;
    }

    public void setTspackagedata(String tspackagedata) {
        this.tspackagedata = tspackagedata;
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

    public Integer getStstatus() {
        return ststatus;
    }

    public void setStstatus(Integer ststatus) {
        this.ststatus = ststatus;
    }

    @Override
    public String toString() {
        return "TTerminalSoftwareItem{" +
                "tsiid=" + tsiid +
                ", tstype=" + tstype +
                ", tsoptionfalag=" + tsoptionfalag +
                ", tsversionno=" + tsversionno +
                ", tsprovider=" + tsprovider +
                ", tsversionname='" + tsversionname + '\'' +
                ", tsuploaddate=" + tsuploaddate +
                ", tspackagedata='" + tspackagedata + '\'' +
                ", tsmd5='" + tsmd5 + '\'' +
                ", tsmemo='" + tsmemo + '\'' +
                ", ststatus=" + ststatus +
                '}';
    }
}
