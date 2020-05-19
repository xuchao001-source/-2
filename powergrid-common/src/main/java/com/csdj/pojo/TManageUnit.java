package com.csdj.pojo;

/**
 * 单位结构表
 */
public class TManageUnit {
    private  Integer muid;
    private  String muno;
    private  String muname;
    private  Integer musuperior;
    private  String mumemo;
    private  Integer gprsparamid;

    public Integer getMuid() {
        return muid;
    }

    public void setMuid(Integer muid) {
        this.muid = muid;
    }

    public String getMuno() {
        return muno;
    }

    public void setMuno(String muno) {
        this.muno = muno;
    }

    public String getMuname() {
        return muname;
    }

    public void setMuname(String muname) {
        this.muname = muname;
    }

    public Integer getMusuperior() {
        return musuperior;
    }

    public void setMusuperior(Integer musuperior) {
        this.musuperior = musuperior;
    }

    public String getMumemo() {
        return mumemo;
    }

    public void setMumemo(String mumemo) {
        this.mumemo = mumemo;
    }

    public Integer getGprsparamid() {
        return gprsparamid;
    }

    public void setGprsparamid(Integer gprsparamid) {
        this.gprsparamid = gprsparamid;
    }

    @Override
    public String toString() {
        return "TManageUnit{" +
                "muid=" + muid +
                ", muno='" + muno + '\'' +
                ", muname='" + muname + '\'' +
                ", musuperior=" + musuperior +
                ", mumemo='" + mumemo + '\'' +
                ", gprsparamid=" + gprsparamid +
                '}';
    }
}
