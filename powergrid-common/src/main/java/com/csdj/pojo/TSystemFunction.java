package com.csdj.pojo;

/**
 * 系统功能控制表
 */
public class TSystemFunction {
    private  String sfid;
    private  String sftitle;
    private  Integer sfsuperiorid;
    private  Integer sfvalue;

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    public String getSftitle() {
        return sftitle;
    }

    public void setSftitle(String sftitle) {
        this.sftitle = sftitle;
    }

    public Integer getSfsuperiorid() {
        return sfsuperiorid;
    }

    public void setSfsuperiorid(Integer sfsuperiorid) {
        this.sfsuperiorid = sfsuperiorid;
    }

    public Integer getSfvalue() {
        return sfvalue;
    }

    public void setSfvalue(Integer sfvalue) {
        this.sfvalue = sfvalue;
    }

    @Override
    public String toString() {
        return "TSystemFunction{" +
                "sfid='" + sfid + '\'' +
                ", sftitle='" + sftitle + '\'' +
                ", sfsuperiorid=" + sfsuperiorid +
                ", sfvalue=" + sfvalue +
                '}';
    }
}
