package com.csdj.pojo;

/**
 * 数据模版明细表
 */
public class TDataTemplateItem {
    private  Integer dtiid;
    private  Integer dtiset;
    private  String  dtidataid;
    private  Integer  dtiidtype;
    private  String dtivalue;
    private String  dticompare;
    private  String dtuprotctcode;
    private  Integer  dtiextenddata;
    private Integer dtiorder;
    private Integer dtieedfalg;

    public Integer getDtiid() {
        return dtiid;
    }

    public void setDtiid(Integer dtiid) {
        this.dtiid = dtiid;
    }

    public Integer getDtiset() {
        return dtiset;
    }

    public void setDtiset(Integer dtiset) {
        this.dtiset = dtiset;
    }

    public String getDtidataid() {
        return dtidataid;
    }

    public void setDtidataid(String dtidataid) {
        this.dtidataid = dtidataid;
    }

    public Integer getDtiidtype() {
        return dtiidtype;
    }

    public void setDtiidtype(Integer dtiidtype) {
        this.dtiidtype = dtiidtype;
    }

    public String getDtivalue() {
        return dtivalue;
    }

    public void setDtivalue(String dtivalue) {
        this.dtivalue = dtivalue;
    }

    public String getDticompare() {
        return dticompare;
    }

    public void setDticompare(String dticompare) {
        this.dticompare = dticompare;
    }

    public String getDtuprotctcode() {
        return dtuprotctcode;
    }

    public void setDtuprotctcode(String dtuprotctcode) {
        this.dtuprotctcode = dtuprotctcode;
    }

    public Integer getDtiextenddata() {
        return dtiextenddata;
    }

    public void setDtiextenddata(Integer dtiextenddata) {
        this.dtiextenddata = dtiextenddata;
    }

    public Integer getDtiorder() {
        return dtiorder;
    }

    public void setDtiorder(Integer dtiorder) {
        this.dtiorder = dtiorder;
    }

    public Integer getDtieedfalg() {
        return dtieedfalg;
    }

    public void setDtieedfalg(Integer dtieedfalg) {
        this.dtieedfalg = dtieedfalg;
    }

    @Override
    public String toString() {
        return "TDataTemplateItem{" +
                "dtiid=" + dtiid +
                ", dtiset=" + dtiset +
                ", dtidataid='" + dtidataid + '\'' +
                ", dtiidtype=" + dtiidtype +
                ", dtivalue='" + dtivalue + '\'' +
                ", dticompare='" + dticompare + '\'' +
                ", dtuprotctcode='" + dtuprotctcode + '\'' +
                ", dtiextenddata=" + dtiextenddata +
                ", dtiorder=" + dtiorder +
                ", dtieedfalg=" + dtieedfalg +
                '}';
    }
}
