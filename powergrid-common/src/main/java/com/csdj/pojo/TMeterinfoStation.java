package com.csdj.pojo;

/**
 * 采集电表档案信息
 */
public class TMeterinfoStation {
    private Integer  tmid;
    private Integer tmterid;
    private String  tmmeterno;
    private String tmcommaddr;
    private String tmaccount;
    private String  tmaccountname;
    private String  tmaddress;
    private String  tmlinkman;
    private String tmphone;
    private String tmmobilephone;
    private Integer  tmprotocoltype;
    private Integer  tmencryptkeytype;
    private Integer  tmmeteroint;
    private Integer tmonlinestatus;

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }

    public Integer getTmterid() {
        return tmterid;
    }

    public void setTmterid(Integer tmterid) {
        this.tmterid = tmterid;
    }

    public String getTmmeterno() {
        return tmmeterno;
    }

    public void setTmmeterno(String tmmeterno) {
        this.tmmeterno = tmmeterno;
    }

    public String getTmcommaddr() {
        return tmcommaddr;
    }

    public void setTmcommaddr(String tmcommaddr) {
        this.tmcommaddr = tmcommaddr;
    }

    public String getTmaccount() {
        return tmaccount;
    }

    public void setTmaccount(String tmaccount) {
        this.tmaccount = tmaccount;
    }

    public String getTmaccountname() {
        return tmaccountname;
    }

    public void setTmaccountname(String tmaccountname) {
        this.tmaccountname = tmaccountname;
    }

    public String getTmaddress() {
        return tmaddress;
    }

    public void setTmaddress(String tmaddress) {
        this.tmaddress = tmaddress;
    }

    public String getTmlinkman() {
        return tmlinkman;
    }

    public void setTmlinkman(String tmlinkman) {
        this.tmlinkman = tmlinkman;
    }

    public String getTmphone() {
        return tmphone;
    }

    public void setTmphone(String tmphone) {
        this.tmphone = tmphone;
    }

    public String getTmmobilephone() {
        return tmmobilephone;
    }

    public void setTmmobilephone(String tmmobilephone) {
        this.tmmobilephone = tmmobilephone;
    }

    public Integer getTmprotocoltype() {
        return tmprotocoltype;
    }

    public void setTmprotocoltype(Integer tmprotocoltype) {
        this.tmprotocoltype = tmprotocoltype;
    }

    public Integer getTmencryptkeytype() {
        return tmencryptkeytype;
    }

    public void setTmencryptkeytype(Integer tmencryptkeytype) {
        this.tmencryptkeytype = tmencryptkeytype;
    }

    public Integer getTmmeteroint() {
        return tmmeteroint;
    }

    public void setTmmeteroint(Integer tmmeteroint) {
        this.tmmeteroint = tmmeteroint;
    }

    public Integer getTmonlinestatus() {
        return tmonlinestatus;
    }

    public void setTmonlinestatus(Integer tmonlinestatus) {
        this.tmonlinestatus = tmonlinestatus;
    }

    @Override
    public String toString() {
        return "TMeterinfoStation{" +
                "tmid=" + tmid +
                ", tmterid=" + tmterid +
                ", tmmeterno='" + tmmeterno + '\'' +
                ", tmcommaddr='" + tmcommaddr + '\'' +
                ", tmaccount='" + tmaccount + '\'' +
                ", tmaccountname='" + tmaccountname + '\'' +
                ", tmaddress='" + tmaddress + '\'' +
                ", tmlinkman='" + tmlinkman + '\'' +
                ", tmphone='" + tmphone + '\'' +
                ", tmmobilephone='" + tmmobilephone + '\'' +
                ", tmprotocoltype=" + tmprotocoltype +
                ", tmencryptkeytype=" + tmencryptkeytype +
                ", tmmeteroint=" + tmmeteroint +
                ", tmonlinestatus=" + tmonlinestatus +
                '}';
    }
}
