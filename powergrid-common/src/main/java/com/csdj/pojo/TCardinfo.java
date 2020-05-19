package com.csdj.pojo;

/**
 * 操作员卡号信息记录表
 */
public class TCardinfo {
    private Integer  tid;
    private String topercard;
    private String  tbizcard;
    private Integer  topid;
    private String  topname;
    private String  tunitno;
    private String  tunitname;
    private String tterminalno;
    private String   tterversion;
    private String thardno;
    private String  tsafeno;
    private String  tcpno;

    @Override
    public String toString() {
        return "TCardinfo{" +
                "tid=" + tid +
                ", topercard='" + topercard + '\'' +
                ", tbizcard='" + tbizcard + '\'' +
                ", topid=" + topid +
                ", topname='" + topname + '\'' +
                ", tunitno='" + tunitno + '\'' +
                ", tunitname='" + tunitname + '\'' +
                ", tterminalno='" + tterminalno + '\'' +
                ", tterversion='" + tterversion + '\'' +
                ", thardno='" + thardno + '\'' +
                ", tsafeno='" + tsafeno + '\'' +
                ", tcpno='" + tcpno + '\'' +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTopercard() {
        return topercard;
    }

    public void setTopercard(String topercard) {
        this.topercard = topercard;
    }

    public String getTbizcard() {
        return tbizcard;
    }

    public void setTbizcard(String tbizcard) {
        this.tbizcard = tbizcard;
    }

    public Integer getTopid() {
        return topid;
    }

    public void setTopid(Integer topid) {
        this.topid = topid;
    }

    public String getTopname() {
        return topname;
    }

    public void setTopname(String topname) {
        this.topname = topname;
    }

    public String getTunitno() {
        return tunitno;
    }

    public void setTunitno(String tunitno) {
        this.tunitno = tunitno;
    }

    public String getTunitname() {
        return tunitname;
    }

    public void setTunitname(String tunitname) {
        this.tunitname = tunitname;
    }

    public String getTterminalno() {
        return tterminalno;
    }

    public void setTterminalno(String tterminalno) {
        this.tterminalno = tterminalno;
    }

    public String getTterversion() {
        return tterversion;
    }

    public void setTterversion(String tterversion) {
        this.tterversion = tterversion;
    }

    public String getThardno() {
        return thardno;
    }

    public void setThardno(String thardno) {
        this.thardno = thardno;
    }

    public String getTsafeno() {
        return tsafeno;
    }

    public void setTsafeno(String tsafeno) {
        this.tsafeno = tsafeno;
    }

    public String getTcpno() {
        return tcpno;
    }

    public void setTcpno(String tcpno) {
        this.tcpno = tcpno;
    }
}
