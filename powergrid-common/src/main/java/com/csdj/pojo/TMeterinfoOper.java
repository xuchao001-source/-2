package com.csdj.pojo;

/**
 * 操作员管理电表表
 */
public class TMeterinfoOper {
    private  Integer  msiid;
    private Integer  operid;
    private String  opername;
    private Integer  unitid;
    private String unitname;
    private String msianyid;
    private String msimeterno;
    private String  msicommaddr;
    private String  msiaccount;
    private String  msiaccountname;
    private String  msiaddress;
    private String msilinkman;
    private String  msiphone;
    private String  msimobilephone;
    private String  msisn;
    private Integer  msimultiple;
    private Integer  status;
    private Integer keytype;
    private String div;
    private String ketdata;
    private Integer  keynum;

    public Integer getMsiid() {
        return msiid;
    }

    public void setMsiid(Integer msiid) {
        this.msiid = msiid;
    }

    public Integer getOperid() {
        return operid;
    }

    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getMsianyid() {
        return msianyid;
    }

    public void setMsianyid(String msianyid) {
        this.msianyid = msianyid;
    }

    public String getMsimeterno() {
        return msimeterno;
    }

    public void setMsimeterno(String msimeterno) {
        this.msimeterno = msimeterno;
    }

    public String getMsicommaddr() {
        return msicommaddr;
    }

    public void setMsicommaddr(String msicommaddr) {
        this.msicommaddr = msicommaddr;
    }

    public String getMsiaccount() {
        return msiaccount;
    }

    public void setMsiaccount(String msiaccount) {
        this.msiaccount = msiaccount;
    }

    public String getMsiaccountname() {
        return msiaccountname;
    }

    public void setMsiaccountname(String msiaccountname) {
        this.msiaccountname = msiaccountname;
    }

    public String getMsiaddress() {
        return msiaddress;
    }

    public void setMsiaddress(String msiaddress) {
        this.msiaddress = msiaddress;
    }

    public String getMsilinkman() {
        return msilinkman;
    }

    public void setMsilinkman(String msilinkman) {
        this.msilinkman = msilinkman;
    }

    public String getMsiphone() {
        return msiphone;
    }

    public void setMsiphone(String msiphone) {
        this.msiphone = msiphone;
    }

    public String getMsimobilephone() {
        return msimobilephone;
    }

    public void setMsimobilephone(String msimobilephone) {
        this.msimobilephone = msimobilephone;
    }

    public String getMsisn() {
        return msisn;
    }

    public void setMsisn(String msisn) {
        this.msisn = msisn;
    }

    public Integer getMsimultiple() {
        return msimultiple;
    }

    public void setMsimultiple(Integer msimultiple) {
        this.msimultiple = msimultiple;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getKeytype() {
        return keytype;
    }

    public void setKeytype(Integer keytype) {
        this.keytype = keytype;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getKetdata() {
        return ketdata;
    }

    public void setKetdata(String ketdata) {
        this.ketdata = ketdata;
    }

    public Integer getKeynum() {
        return keynum;
    }

    public void setKeynum(Integer keynum) {
        this.keynum = keynum;
    }

    @Override
    public String toString() {
        return "TMeterinfoOper{" +
                "msiid=" + msiid +
                ", operid=" + operid +
                ", opername='" + opername + '\'' +
                ", unitid=" + unitid +
                ", unitname='" + unitname + '\'' +
                ", msianyid='" + msianyid + '\'' +
                ", msimeterno='" + msimeterno + '\'' +
                ", msicommaddr='" + msicommaddr + '\'' +
                ", msiaccount='" + msiaccount + '\'' +
                ", msiaccountname='" + msiaccountname + '\'' +
                ", msiaddress='" + msiaddress + '\'' +
                ", msilinkman='" + msilinkman + '\'' +
                ", msiphone='" + msiphone + '\'' +
                ", msimobilephone='" + msimobilephone + '\'' +
                ", msisn='" + msisn + '\'' +
                ", msimultiple=" + msimultiple +
                ", status=" + status +
                ", keytype=" + keytype +
                ", div='" + div + '\'' +
                ", ketdata='" + ketdata + '\'' +
                ", keynum=" + keynum +
                '}';
    }
}
