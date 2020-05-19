package com.csdj.pojo;

/**
 * 掌机类型表
 */
public class TTerminalType {
private  Integer ttid;
 private  Integer ttno;
 private  String ttname;
 private  Integer ttproviderid;
 private  String ttmemo;
 private  Integer  ttstatus;
 private  Integer  tttypename;

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getTtno() {
        return ttno;
    }

    public void setTtno(Integer ttno) {
        this.ttno = ttno;
    }

    public String getTtname() {
        return ttname;
    }

    public void setTtname(String ttname) {
        this.ttname = ttname;
    }

    public Integer getTtproviderid() {
        return ttproviderid;
    }

    public void setTtproviderid(Integer ttproviderid) {
        this.ttproviderid = ttproviderid;
    }

    public String getTtmemo() {
        return ttmemo;
    }

    public void setTtmemo(String ttmemo) {
        this.ttmemo = ttmemo;
    }

    public Integer getTtstatus() {
        return ttstatus;
    }

    public void setTtstatus(Integer ttstatus) {
        this.ttstatus = ttstatus;
    }

    public Integer getTttypename() {
        return tttypename;
    }

    public void setTttypename(Integer tttypename) {
        this.tttypename = tttypename;
    }

    @Override
    public String toString() {
        return "TTerminalType{" +
                "ttid=" + ttid +
                ", ttno=" + ttno +
                ", ttname='" + ttname + '\'' +
                ", ttproviderid=" + ttproviderid +
                ", ttmemo='" + ttmemo + '\'' +
                ", ttstatus=" + ttstatus +
                ", tttypename=" + tttypename +
                '}';
    }
}
