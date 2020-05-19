package com.csdj.pojo;

/**
 * 装换互感器档案
 */
public class THistoryBatch {
    private Integer tid;
    private Integer tiid;
    private String  lotno;
    private String barcode;
    private String  assetno;
    private String  madeno;
    private String  appno;
    private  String  rcratiocode;
    private String  voltratiocode;
    private String  chgdesc;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTiid() {
        return tiid;
    }

    public void setTiid(Integer tiid) {
        this.tiid = tiid;
    }

    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getAssetno() {
        return assetno;
    }

    public void setAssetno(String assetno) {
        this.assetno = assetno;
    }

    public String getMadeno() {
        return madeno;
    }

    public void setMadeno(String madeno) {
        this.madeno = madeno;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getRcratiocode() {
        return rcratiocode;
    }

    public void setRcratiocode(String rcratiocode) {
        this.rcratiocode = rcratiocode;
    }

    public String getVoltratiocode() {
        return voltratiocode;
    }

    public void setVoltratiocode(String voltratiocode) {
        this.voltratiocode = voltratiocode;
    }

    public String getChgdesc() {
        return chgdesc;
    }

    public void setChgdesc(String chgdesc) {
        this.chgdesc = chgdesc;
    }

    @Override
    public String toString() {
        return "THistoryBatch{" +
                "tid=" + tid +
                ", tiid=" + tiid +
                ", lotno='" + lotno + '\'' +
                ", barcode='" + barcode + '\'' +
                ", assetno='" + assetno + '\'' +
                ", madeno='" + madeno + '\'' +
                ", appno='" + appno + '\'' +
                ", rcratiocode='" + rcratiocode + '\'' +
                ", voltratiocode='" + voltratiocode + '\'' +
                ", chgdesc='" + chgdesc + '\'' +
                '}';
    }
}
