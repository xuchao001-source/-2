package com.csdj.pojo;

/**
 * 表箱和表关系表
 */
public class MeterAndBoxInfo {
    private Integer reginforid;
    private  String  orgno;
    private String consno;
    private String consname;
    private String  elecaddr;
    private String  mrsectno;
    private String  contactname;
    private String  contacttel;
    private String  cbdname;
    private String  cbyno;
    private String  cbyname;
    private String  modelname;
    private  String  assetno;
    private String manufacturer;
    private String  bdbz;
    private String  sfsmbz;
    private String createdate;
    private String  bxtxm;
    private String bjxm;
    private String  bz;

    public Integer getReginforid() {
        return reginforid;
    }

    public void setReginforid(Integer reginforid) {
        this.reginforid = reginforid;
    }

    public String getOrgno() {
        return orgno;
    }

    public void setOrgno(String orgno) {
        this.orgno = orgno;
    }

    public String getConsno() {
        return consno;
    }

    public void setConsno(String consno) {
        this.consno = consno;
    }

    public String getConsname() {
        return consname;
    }

    public void setConsname(String consname) {
        this.consname = consname;
    }

    public String getElecaddr() {
        return elecaddr;
    }

    public void setElecaddr(String elecaddr) {
        this.elecaddr = elecaddr;
    }

    public String getMrsectno() {
        return mrsectno;
    }

    public void setMrsectno(String mrsectno) {
        this.mrsectno = mrsectno;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public String getCbdname() {
        return cbdname;
    }

    public void setCbdname(String cbdname) {
        this.cbdname = cbdname;
    }

    public String getCbyno() {
        return cbyno;
    }

    public void setCbyno(String cbyno) {
        this.cbyno = cbyno;
    }

    public String getCbyname() {
        return cbyname;
    }

    public void setCbyname(String cbyname) {
        this.cbyname = cbyname;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getAssetno() {
        return assetno;
    }

    public void setAssetno(String assetno) {
        this.assetno = assetno;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBdbz() {
        return bdbz;
    }

    public void setBdbz(String bdbz) {
        this.bdbz = bdbz;
    }

    public String getSfsmbz() {
        return sfsmbz;
    }

    public void setSfsmbz(String sfsmbz) {
        this.sfsmbz = sfsmbz;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getBxtxm() {
        return bxtxm;
    }

    public void setBxtxm(String bxtxm) {
        this.bxtxm = bxtxm;
    }

    public String getBjxm() {
        return bjxm;
    }

    public void setBjxm(String bjxm) {
        this.bjxm = bjxm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "MeterAndBoxInfo{" +
                "reginforid=" + reginforid +
                ", orgno='" + orgno + '\'' +
                ", consno='" + consno + '\'' +
                ", consname='" + consname + '\'' +
                ", elecaddr='" + elecaddr + '\'' +
                ", mrsectno='" + mrsectno + '\'' +
                ", contactname='" + contactname + '\'' +
                ", contacttel='" + contacttel + '\'' +
                ", cbdname='" + cbdname + '\'' +
                ", cbyno='" + cbyno + '\'' +
                ", cbyname='" + cbyname + '\'' +
                ", modelname='" + modelname + '\'' +
                ", assetno='" + assetno + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", bdbz='" + bdbz + '\'' +
                ", sfsmbz='" + sfsmbz + '\'' +
                ", createdate='" + createdate + '\'' +
                ", bxtxm='" + bxtxm + '\'' +
                ", bjxm='" + bjxm + '\'' +
                ", bz='" + bz + '\'' +
                '}';
    }
}
