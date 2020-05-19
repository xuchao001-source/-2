package com.csdj.pojo;

/**
 * 采集终端命令表
 */
public class TCONCENTRATORCOMMAND {
    private Integer cid;
    private String cname;
    private  Integer cpid;
    private String ccommandno;
    private  String cafn;
    private Integer cvalus;
    private Integer  cfn;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public String getCcommandno() {
        return ccommandno;
    }

    public void setCcommandno(String ccommandno) {
        this.ccommandno = ccommandno;
    }

    public String getCafn() {
        return cafn;
    }

    public void setCafn(String cafn) {
        this.cafn = cafn;
    }

    public Integer getCvalus() {
        return cvalus;
    }

    public void setCvalus(Integer cvalus) {
        this.cvalus = cvalus;
    }

    public Integer getCfn() {
        return cfn;
    }

    public void setCfn(Integer cfn) {
        this.cfn = cfn;
    }

    @Override
    public String toString() {
        return "TCONCENTRATORCOMMAND{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cpid=" + cpid +
                ", ccommandno='" + ccommandno + '\'' +
                ", cafn='" + cafn + '\'' +
                ", cvalus=" + cvalus +
                ", cfn=" + cfn +
                '}';
    }
}
