package com.csdj.pojo;

import java.util.Date;

/**
 * 请求远程命令表
 */
public class TREMOTEORDER {
        private   Integer  troid;
        private Integer trotaskid;
        private String  troassetno;
        private String  troconsno;
        private String  trooperatetype;
        private Integer troorgno;
        private Date  trorecordtime;
        private String  troperator;
        private Integer  trofalitime;
        private Date  trotaskstarttime;
        private Date  trotaskendtime;

    public Integer getTroid() {
        return troid;
    }

    public void setTroid(Integer troid) {
        this.troid = troid;
    }

    public Integer getTrotaskid() {
        return trotaskid;
    }

    public void setTrotaskid(Integer trotaskid) {
        this.trotaskid = trotaskid;
    }

    public String getTroassetno() {
        return troassetno;
    }

    public void setTroassetno(String troassetno) {
        this.troassetno = troassetno;
    }

    public String getTroconsno() {
        return troconsno;
    }

    public void setTroconsno(String troconsno) {
        this.troconsno = troconsno;
    }

    public String getTrooperatetype() {
        return trooperatetype;
    }

    public void setTrooperatetype(String trooperatetype) {
        this.trooperatetype = trooperatetype;
    }

    public Integer getTroorgno() {
        return troorgno;
    }

    public void setTroorgno(Integer troorgno) {
        this.troorgno = troorgno;
    }

    public Date getTrorecordtime() {
        return trorecordtime;
    }

    public void setTrorecordtime(Date trorecordtime) {
        this.trorecordtime = trorecordtime;
    }

    public String getTroperator() {
        return troperator;
    }

    public void setTroperator(String troperator) {
        this.troperator = troperator;
    }

    public Integer getTrofalitime() {
        return trofalitime;
    }

    public void setTrofalitime(Integer trofalitime) {
        this.trofalitime = trofalitime;
    }

    public Date getTrotaskstarttime() {
        return trotaskstarttime;
    }

    public void setTrotaskstarttime(Date trotaskstarttime) {
        this.trotaskstarttime = trotaskstarttime;
    }

    public Date getTrotaskendtime() {
        return trotaskendtime;
    }

    public void setTrotaskendtime(Date trotaskendtime) {
        this.trotaskendtime = trotaskendtime;
    }

    @Override
    public String toString() {
        return "TREMOTEORDER{" +
                "troid=" + troid +
                ", trotaskid=" + trotaskid +
                ", troassetno='" + troassetno + '\'' +
                ", troconsno='" + troconsno + '\'' +
                ", trooperatetype='" + trooperatetype + '\'' +
                ", troorgno=" + troorgno +
                ", trorecordtime=" + trorecordtime +
                ", troperator='" + troperator + '\'' +
                ", trofalitime=" + trofalitime +
                ", trotaskstarttime=" + trotaskstarttime +
                ", trotaskendtime=" + trotaskendtime +
                '}';
    }
}
