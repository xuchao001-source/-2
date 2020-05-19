package com.csdj.pojo;

/**
 * 装换电表档案
 */
public class THistoryMeter {
    private Integer  mid;
    private Integer  meterid;
    private String  barcode;
    private String  lotno;
    private String  assetno;
    private String  madeno;
    private Integer  selffactor;
    private String  appno;
    private String  div;
    private String  opercardno;
    private String  bizcardno;
    private Integer keynum;
    private String  authritydata;
    private String  chgdesc;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMeterid() {
        return meterid;
    }

    public void setMeterid(Integer meterid) {
        this.meterid = meterid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno;
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

    public Integer getSelffactor() {
        return selffactor;
    }

    public void setSelffactor(Integer selffactor) {
        this.selffactor = selffactor;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getOpercardno() {
        return opercardno;
    }

    public void setOpercardno(String opercardno) {
        this.opercardno = opercardno;
    }

    public String getBizcardno() {
        return bizcardno;
    }

    public void setBizcardno(String bizcardno) {
        this.bizcardno = bizcardno;
    }

    public Integer getKeynum() {
        return keynum;
    }

    public void setKeynum(Integer keynum) {
        this.keynum = keynum;
    }

    public String getAuthritydata() {
        return authritydata;
    }

    public void setAuthritydata(String authritydata) {
        this.authritydata = authritydata;
    }

    public String getChgdesc() {
        return chgdesc;
    }

    public void setChgdesc(String chgdesc) {
        this.chgdesc = chgdesc;
    }

    @Override
    public String toString() {
        return "THistoryMeter{" +
                "mid=" + mid +
                ", meterid=" + meterid +
                ", barcode='" + barcode + '\'' +
                ", lotno='" + lotno + '\'' +
                ", assetno='" + assetno + '\'' +
                ", madeno='" + madeno + '\'' +
                ", selffactor=" + selffactor +
                ", appno='" + appno + '\'' +
                ", div='" + div + '\'' +
                ", opercardno='" + opercardno + '\'' +
                ", bizcardno='" + bizcardno + '\'' +
                ", keynum=" + keynum +
                ", authritydata='" + authritydata + '\'' +
                ", chgdesc='" + chgdesc + '\'' +
                '}';
    }
}
