package com.csdj.pojo;

/**
 * 掌机信息表
 */
public class TTerminal {
    private  Integer tid;
    private String tno;
    private  Integer ttype;
    private  Integer thardversion;
    private  Integer  tmanageunit;
    private  Integer  topertor;
    private  Integer  tsoftwar;
    private  String tmemo;
private  Integer  trecordestroy;
private  String safevaersion;
private  String softwarevno;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public Integer getTtype() {
        return ttype;
    }

    public void setTtype(Integer ttype) {
        this.ttype = ttype;
    }

    public Integer getThardversion() {
        return thardversion;
    }

    public void setThardversion(Integer thardversion) {
        this.thardversion = thardversion;
    }

    public Integer getTmanageunit() {
        return tmanageunit;
    }

    public void setTmanageunit(Integer tmanageunit) {
        this.tmanageunit = tmanageunit;
    }

    public Integer getTopertor() {
        return topertor;
    }

    public void setTopertor(Integer topertor) {
        this.topertor = topertor;
    }

    public Integer getTsoftwar() {
        return tsoftwar;
    }

    public void setTsoftwar(Integer tsoftwar) {
        this.tsoftwar = tsoftwar;
    }

    public String getTmemo() {
        return tmemo;
    }

    public void setTmemo(String tmemo) {
        this.tmemo = tmemo;
    }

    public Integer getTrecordestroy() {
        return trecordestroy;
    }

    public void setTrecordestroy(Integer trecordestroy) {
        this.trecordestroy = trecordestroy;
    }

    public String getSafevaersion() {
        return safevaersion;
    }

    public void setSafevaersion(String safevaersion) {
        this.safevaersion = safevaersion;
    }

    public String getSoftwarevno() {
        return softwarevno;
    }

    public void setSoftwarevno(String softwarevno) {
        this.softwarevno = softwarevno;
    }

    @Override
    public String toString() {
        return "TTerminal{" +
                "tid=" + tid +
                ", tno='" + tno + '\'' +
                ", ttype=" + ttype +
                ", thardversion=" + thardversion +
                ", tmanageunit=" + tmanageunit +
                ", topertor=" + topertor +
                ", tsoftwar=" + tsoftwar +
                ", tmemo='" + tmemo + '\'' +
                ", trecordestroy=" + trecordestroy +
                ", safevaersion='" + safevaersion + '\'' +
                ", softwarevno='" + softwarevno + '\'' +
                '}';
    }
}
