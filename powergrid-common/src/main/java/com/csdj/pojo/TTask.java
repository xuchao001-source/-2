package com.csdj.pojo;

import java.util.Date;

/**
 *
 任务表
 */
public class TTask {
    private  Integer tid;
    private  Integer  textendid;
    private  String  tname;
    private  Integer  tcreatorid;
    private  Integer  ttype;
    private Integer tterminaltype;
    private Integer  ttaskno;
    private  Integer toperid;
    private  Integer tisfree;
    private  String taccount;
    private  Integer tmanageunitid;
    private Integer  tmset;
    private  String  tsettitle;
    private  Integer  tdatatemolate;
    private  String  ttemplatetitle;
    private  Integer tterdatatemplate;
    private Date tfreezetime;
    private  Date  tcreatetime;
    private  Date  tbegintime;
    private Date  tdowntime;
    private Date tdeadtime;
    private Integer tstatus;
    private Integer  textend;
    private Integer tpriority;
    private  String tmemo;
    private Integer topertype;
    private String  tauthority;
    private  Integer tshareid;
    private Integer  tresource;
    private String  tappno;
    private  Integer tconturldebug;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTextendid() {
        return textendid;
    }

    public void setTextendid(Integer textendid) {
        this.textendid = textendid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTcreatorid() {
        return tcreatorid;
    }

    public void setTcreatorid(Integer tcreatorid) {
        this.tcreatorid = tcreatorid;
    }

    public Integer getTtype() {
        return ttype;
    }

    public void setTtype(Integer ttype) {
        this.ttype = ttype;
    }

    public Integer getTterminaltype() {
        return tterminaltype;
    }

    public void setTterminaltype(Integer tterminaltype) {
        this.tterminaltype = tterminaltype;
    }

    public Integer getTtaskno() {
        return ttaskno;
    }

    public void setTtaskno(Integer ttaskno) {
        this.ttaskno = ttaskno;
    }

    public Integer getToperid() {
        return toperid;
    }

    public void setToperid(Integer toperid) {
        this.toperid = toperid;
    }

    public Integer getTisfree() {
        return tisfree;
    }

    public void setTisfree(Integer tisfree) {
        this.tisfree = tisfree;
    }

    public String getTaccount() {
        return taccount;
    }

    public void setTaccount(String taccount) {
        this.taccount = taccount;
    }

    public Integer getTmanageunitid() {
        return tmanageunitid;
    }

    public void setTmanageunitid(Integer tmanageunitid) {
        this.tmanageunitid = tmanageunitid;
    }

    public Integer getTmset() {
        return tmset;
    }

    public void setTmset(Integer tmset) {
        this.tmset = tmset;
    }

    public String getTsettitle() {
        return tsettitle;
    }

    public void setTsettitle(String tsettitle) {
        this.tsettitle = tsettitle;
    }

    public Integer getTdatatemolate() {
        return tdatatemolate;
    }

    public void setTdatatemolate(Integer tdatatemolate) {
        this.tdatatemolate = tdatatemolate;
    }

    public String getTtemplatetitle() {
        return ttemplatetitle;
    }

    public void setTtemplatetitle(String ttemplatetitle) {
        this.ttemplatetitle = ttemplatetitle;
    }

    public Integer getTterdatatemplate() {
        return tterdatatemplate;
    }

    public void setTterdatatemplate(Integer tterdatatemplate) {
        this.tterdatatemplate = tterdatatemplate;
    }

    public Date getTfreezetime() {
        return tfreezetime;
    }

    public void setTfreezetime(Date tfreezetime) {
        this.tfreezetime = tfreezetime;
    }

    public Date getTcreatetime() {
        return tcreatetime;
    }

    public void setTcreatetime(Date tcreatetime) {
        this.tcreatetime = tcreatetime;
    }

    public Date getTbegintime() {
        return tbegintime;
    }

    public void setTbegintime(Date tbegintime) {
        this.tbegintime = tbegintime;
    }

    public Date getTdowntime() {
        return tdowntime;
    }

    public void setTdowntime(Date tdowntime) {
        this.tdowntime = tdowntime;
    }

    public Date getTdeadtime() {
        return tdeadtime;
    }

    public void setTdeadtime(Date tdeadtime) {
        this.tdeadtime = tdeadtime;
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }

    public Integer getTextend() {
        return textend;
    }

    public void setTextend(Integer textend) {
        this.textend = textend;
    }

    public Integer getTpriority() {
        return tpriority;
    }

    public void setTpriority(Integer tpriority) {
        this.tpriority = tpriority;
    }

    public String getTmemo() {
        return tmemo;
    }

    public void setTmemo(String tmemo) {
        this.tmemo = tmemo;
    }

    public Integer getTopertype() {
        return topertype;
    }

    public void setTopertype(Integer topertype) {
        this.topertype = topertype;
    }

    public String getTauthority() {
        return tauthority;
    }

    public void setTauthority(String tauthority) {
        this.tauthority = tauthority;
    }

    public Integer getTshareid() {
        return tshareid;
    }

    public void setTshareid(Integer tshareid) {
        this.tshareid = tshareid;
    }

    public Integer getTresource() {
        return tresource;
    }

    public void setTresource(Integer tresource) {
        this.tresource = tresource;
    }

    public String getTappno() {
        return tappno;
    }

    public void setTappno(String tappno) {
        this.tappno = tappno;
    }

    public Integer getTconturldebug() {
        return tconturldebug;
    }

    public void setTconturldebug(Integer tconturldebug) {
        this.tconturldebug = tconturldebug;
    }

    @Override
    public String toString() {
        return "TTask{" +
                "tid=" + tid +
                ", textendid=" + textendid +
                ", tname='" + tname + '\'' +
                ", tcreatorid=" + tcreatorid +
                ", ttype=" + ttype +
                ", tterminaltype=" + tterminaltype +
                ", ttaskno=" + ttaskno +
                ", toperid=" + toperid +
                ", tisfree=" + tisfree +
                ", taccount='" + taccount + '\'' +
                ", tmanageunitid=" + tmanageunitid +
                ", tmset=" + tmset +
                ", tsettitle='" + tsettitle + '\'' +
                ", tdatatemolate=" + tdatatemolate +
                ", ttemplatetitle='" + ttemplatetitle + '\'' +
                ", tterdatatemplate=" + tterdatatemplate +
                ", tfreezetime=" + tfreezetime +
                ", tcreatetime=" + tcreatetime +
                ", tbegintime=" + tbegintime +
                ", tdowntime=" + tdowntime +
                ", tdeadtime=" + tdeadtime +
                ", tstatus=" + tstatus +
                ", textend=" + textend +
                ", tpriority=" + tpriority +
                ", tmemo='" + tmemo + '\'' +
                ", topertype=" + topertype +
                ", tauthority='" + tauthority + '\'' +
                ", tshareid=" + tshareid +
                ", tresource=" + tresource +
                ", tappno='" + tappno + '\'' +
                ", tconturldebug=" + tconturldebug +
                '}';
    }
}
