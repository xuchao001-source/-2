package com.csdj.pojo;

import java.util.Date;

/**
 * 作业日志表
 */
public class TWorkItem {
    private Integer wiid;
    private  Integer wiworkid;
    private  String wiwetermo;
    private Integer witype;
    private String widataid;
    private  Integer  witempseq;
    private Integer  wiobjectype;
    private  Integer  wifnsetseq;
private Integer  wifn;
private  Integer  wifnseq;
private String widata;
private Date  wiuploadtime;
private  Date  wiexetime;
private Integer  wiexeoperid;
private Integer wiresult;

    public Integer getWiid() {
        return wiid;
    }

    public void setWiid(Integer wiid) {
        this.wiid = wiid;
    }

    public Integer getWiworkid() {
        return wiworkid;
    }

    public void setWiworkid(Integer wiworkid) {
        this.wiworkid = wiworkid;
    }

    public String getWiwetermo() {
        return wiwetermo;
    }

    public void setWiwetermo(String wiwetermo) {
        this.wiwetermo = wiwetermo;
    }

    public Integer getWitype() {
        return witype;
    }

    public void setWitype(Integer witype) {
        this.witype = witype;
    }

    public String getWidataid() {
        return widataid;
    }

    public void setWidataid(String widataid) {
        this.widataid = widataid;
    }

    public Integer getWitempseq() {
        return witempseq;
    }

    public void setWitempseq(Integer witempseq) {
        this.witempseq = witempseq;
    }

    public Integer getWiobjectype() {
        return wiobjectype;
    }

    public void setWiobjectype(Integer wiobjectype) {
        this.wiobjectype = wiobjectype;
    }

    public Integer getWifnsetseq() {
        return wifnsetseq;
    }

    public void setWifnsetseq(Integer wifnsetseq) {
        this.wifnsetseq = wifnsetseq;
    }

    public Integer getWifn() {
        return wifn;
    }

    public void setWifn(Integer wifn) {
        this.wifn = wifn;
    }

    public Integer getWifnseq() {
        return wifnseq;
    }

    public void setWifnseq(Integer wifnseq) {
        this.wifnseq = wifnseq;
    }

    public String getWidata() {
        return widata;
    }

    public void setWidata(String widata) {
        this.widata = widata;
    }

    public Date getWiuploadtime() {
        return wiuploadtime;
    }

    public void setWiuploadtime(Date wiuploadtime) {
        this.wiuploadtime = wiuploadtime;
    }

    public Date getWiexetime() {
        return wiexetime;
    }

    public void setWiexetime(Date wiexetime) {
        this.wiexetime = wiexetime;
    }

    public Integer getWiexeoperid() {
        return wiexeoperid;
    }

    public void setWiexeoperid(Integer wiexeoperid) {
        this.wiexeoperid = wiexeoperid;
    }

    public Integer getWiresult() {
        return wiresult;
    }

    public void setWiresult(Integer wiresult) {
        this.wiresult = wiresult;
    }

    @Override
    public String toString() {
        return "TWorkItem{" +
                "wiid=" + wiid +
                ", wiworkid=" + wiworkid +
                ", wiwetermo='" + wiwetermo + '\'' +
                ", witype=" + witype +
                ", widataid='" + widataid + '\'' +
                ", witempseq=" + witempseq +
                ", wiobjectype=" + wiobjectype +
                ", wifnsetseq=" + wifnsetseq +
                ", wifn=" + wifn +
                ", wifnseq=" + wifnseq +
                ", widata='" + widata + '\'' +
                ", wiuploadtime=" + wiuploadtime +
                ", wiexetime=" + wiexetime +
                ", wiexeoperid=" + wiexeoperid +
                ", wiresult=" + wiresult +
                '}';
    }
}
