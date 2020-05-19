package com.csdj.pojo;

/**
 * 上传资料信息表
 */
public class TSoftFileInfo {
    private Integer fid;
    private String fname;
    private String  furl;
    private Integer ftype;
    private String  ftypes;
    private Integer  fversionno;
    private String fmd5;
    private String  fmemo;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public String getFtypes() {
        return ftypes;
    }

    public void setFtypes(String ftypes) {
        this.ftypes = ftypes;
    }

    public Integer getFversionno() {
        return fversionno;
    }

    public void setFversionno(Integer fversionno) {
        this.fversionno = fversionno;
    }

    public String getFmd5() {
        return fmd5;
    }

    public void setFmd5(String fmd5) {
        this.fmd5 = fmd5;
    }

    public String getFmemo() {
        return fmemo;
    }

    public void setFmemo(String fmemo) {
        this.fmemo = fmemo;
    }

    @Override
    public String toString() {
        return "TSoftFileInfo{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", furl='" + furl + '\'' +
                ", ftype=" + ftype +
                ", ftypes='" + ftypes + '\'' +
                ", fversionno=" + fversionno +
                ", fmd5='" + fmd5 + '\'' +
                ", fmemo='" + fmemo + '\'' +
                '}';
    }
}
