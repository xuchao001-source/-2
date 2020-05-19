package com.csdj.pojo;

/**
 * 操作对象集合表
 */
public class TMeterSet {
    private  Integer msid;
    private  Integer  msextendid;
    private  Integer  mstype;
    private  String  mstitle;
    private  Integer  msowner;
    private  Integer mscount;
    private  Integer  msdispstatus;
    private  String msmemo;
    private Integer  msiresource;

    public Integer getMsid() {
        return msid;
    }

    public void setMsid(Integer msid) {
        this.msid = msid;
    }

    public Integer getMsextendid() {
        return msextendid;
    }

    public void setMsextendid(Integer msextendid) {
        this.msextendid = msextendid;
    }

    public Integer getMstype() {
        return mstype;
    }

    public void setMstype(Integer mstype) {
        this.mstype = mstype;
    }

    public String getMstitle() {
        return mstitle;
    }

    public void setMstitle(String mstitle) {
        this.mstitle = mstitle;
    }

    public Integer getMsowner() {
        return msowner;
    }

    public void setMsowner(Integer msowner) {
        this.msowner = msowner;
    }

    public Integer getMscount() {
        return mscount;
    }

    public void setMscount(Integer mscount) {
        this.mscount = mscount;
    }

    public Integer getMsdispstatus() {
        return msdispstatus;
    }

    public void setMsdispstatus(Integer msdispstatus) {
        this.msdispstatus = msdispstatus;
    }

    public String getMsmemo() {
        return msmemo;
    }

    public void setMsmemo(String msmemo) {
        this.msmemo = msmemo;
    }

    public Integer getMsiresource() {
        return msiresource;
    }

    public void setMsiresource(Integer msiresource) {
        this.msiresource = msiresource;
    }

    @Override
    public String toString() {
        return "TMeterSet{" +
                "msid=" + msid +
                ", msextendid=" + msextendid +
                ", mstype=" + mstype +
                ", mstitle='" + mstitle + '\'' +
                ", msowner=" + msowner +
                ", mscount=" + mscount +
                ", msdispstatus=" + msdispstatus +
                ", msmemo='" + msmemo + '\'' +
                ", msiresource=" + msiresource +
                '}';
    }
}
