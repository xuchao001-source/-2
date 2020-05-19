package com.csdj.pojo;

import java.util.Date;

/**
 * 资产表
 */
public class TTerminalasset {
    private Integer id;
    private String unitno;
    private String  terorder;
    private String  tertype;
    private Integer provider;
    private String  vendername;
    private Integer  isuser;
    private String opercard;
    private String  bizcard;
    private String  assno;
    private Integer operid;
    private String opername;
    private Date terprodate;
    private String terbatch;
    private String  tersoftvno;
    private  String  hardvno;
    private String safevno;
    private Integer isanonymity;
    private Integer isonline;
    private Integer tertypeid;
    private Integer  tertypeorign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    public String getTerorder() {
        return terorder;
    }

    public void setTerorder(String terorder) {
        this.terorder = terorder;
    }

    public String getTertype() {
        return tertype;
    }

    public void setTertype(String tertype) {
        this.tertype = tertype;
    }

    public Integer getProvider() {
        return provider;
    }

    public void setProvider(Integer provider) {
        this.provider = provider;
    }

    public String getVendername() {
        return vendername;
    }

    public void setVendername(String vendername) {
        this.vendername = vendername;
    }

    public Integer getIsuser() {
        return isuser;
    }

    public void setIsuser(Integer isuser) {
        this.isuser = isuser;
    }

    public String getOpercard() {
        return opercard;
    }

    public void setOpercard(String opercard) {
        this.opercard = opercard;
    }

    public String getBizcard() {
        return bizcard;
    }

    public void setBizcard(String bizcard) {
        this.bizcard = bizcard;
    }

    public String getAssno() {
        return assno;
    }

    public void setAssno(String assno) {
        this.assno = assno;
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

    public Date getTerprodate() {
        return terprodate;
    }

    public void setTerprodate(Date terprodate) {
        this.terprodate = terprodate;
    }

    public String getTerbatch() {
        return terbatch;
    }

    public void setTerbatch(String terbatch) {
        this.terbatch = terbatch;
    }

    public String getTersoftvno() {
        return tersoftvno;
    }

    public void setTersoftvno(String tersoftvno) {
        this.tersoftvno = tersoftvno;
    }

    public String getHardvno() {
        return hardvno;
    }

    public void setHardvno(String hardvno) {
        this.hardvno = hardvno;
    }

    public String getSafevno() {
        return safevno;
    }

    public void setSafevno(String safevno) {
        this.safevno = safevno;
    }

    public Integer getIsanonymity() {
        return isanonymity;
    }

    public void setIsanonymity(Integer isanonymity) {
        this.isanonymity = isanonymity;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Integer getTertypeid() {
        return tertypeid;
    }

    public void setTertypeid(Integer tertypeid) {
        this.tertypeid = tertypeid;
    }

    public Integer getTertypeorign() {
        return tertypeorign;
    }

    public void setTertypeorign(Integer tertypeorign) {
        this.tertypeorign = tertypeorign;
    }

    @Override
    public String toString() {
        return "TTerminalasset{" +
                "id=" + id +
                ", unitno='" + unitno + '\'' +
                ", terorder='" + terorder + '\'' +
                ", tertype='" + tertype + '\'' +
                ", provider=" + provider +
                ", vendername='" + vendername + '\'' +
                ", isuser=" + isuser +
                ", opercard='" + opercard + '\'' +
                ", bizcard='" + bizcard + '\'' +
                ", assno='" + assno + '\'' +
                ", operid=" + operid +
                ", opername='" + opername + '\'' +
                ", terprodate=" + terprodate +
                ", terbatch='" + terbatch + '\'' +
                ", tersoftvno='" + tersoftvno + '\'' +
                ", hardvno='" + hardvno + '\'' +
                ", safevno='" + safevno + '\'' +
                ", isanonymity=" + isanonymity +
                ", isonline=" + isonline +
                ", tertypeid=" + tertypeid +
                ", tertypeorign=" + tertypeorign +
                '}';
    }
}
