package com.csdj.pojo;

/**
 * 采集终端信息
 */
public class TTerinfoStation {
    private  Integer  terid;
    private Integer  ternuitno;
    private String  terno;
    private String  terip;
    private String  teraddress;
    private Integer terstatuc;
    private Integer  port;
    private Integer bps;
    private Integer  stoplocal;
    private Integer  isselect;
    private Integer jiou;
    private Integer unm;
    private Integer  baowenouttime;
    private Integer  zijieouttime;
    private String primake;
    private Integer  terids;
    private Integer  ternuitnos;
    private String  ternos;

    public Integer getTerid() {
        return terid;
    }

    public void setTerid(Integer terid) {
        this.terid = terid;
    }

    public Integer getTernuitno() {
        return ternuitno;
    }

    public void setTernuitno(Integer ternuitno) {
        this.ternuitno = ternuitno;
    }

    public String getTerno() {
        return terno;
    }

    public void setTerno(String terno) {
        this.terno = terno;
    }

    public String getTerip() {
        return terip;
    }

    public void setTerip(String terip) {
        this.terip = terip;
    }

    public String getTeraddress() {
        return teraddress;
    }

    public void setTeraddress(String teraddress) {
        this.teraddress = teraddress;
    }

    public Integer getTerstatuc() {
        return terstatuc;
    }

    public void setTerstatuc(Integer terstatuc) {
        this.terstatuc = terstatuc;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getBps() {
        return bps;
    }

    public void setBps(Integer bps) {
        this.bps = bps;
    }

    public Integer getStoplocal() {
        return stoplocal;
    }

    public void setStoplocal(Integer stoplocal) {
        this.stoplocal = stoplocal;
    }

    public Integer getIsselect() {
        return isselect;
    }

    public void setIsselect(Integer isselect) {
        this.isselect = isselect;
    }

    public Integer getJiou() {
        return jiou;
    }

    public void setJiou(Integer jiou) {
        this.jiou = jiou;
    }

    public Integer getUnm() {
        return unm;
    }

    public void setUnm(Integer unm) {
        this.unm = unm;
    }

    public Integer getBaowenouttime() {
        return baowenouttime;
    }

    public void setBaowenouttime(Integer baowenouttime) {
        this.baowenouttime = baowenouttime;
    }

    public Integer getZijieouttime() {
        return zijieouttime;
    }

    public void setZijieouttime(Integer zijieouttime) {
        this.zijieouttime = zijieouttime;
    }

    public String getPrimake() {
        return primake;
    }

    public void setPrimake(String primake) {
        this.primake = primake;
    }

    public Integer getTerids() {
        return terids;
    }

    public void setTerids(Integer terids) {
        this.terids = terids;
    }

    public Integer getTernuitnos() {
        return ternuitnos;
    }

    public void setTernuitnos(Integer ternuitnos) {
        this.ternuitnos = ternuitnos;
    }

    public String getTernos() {
        return ternos;
    }

    public void setTernos(String ternos) {
        this.ternos = ternos;
    }

    @Override
    public String toString() {
        return "TTerinfoStation{" +
                "terid=" + terid +
                ", ternuitno=" + ternuitno +
                ", terno='" + terno + '\'' +
                ", terip='" + terip + '\'' +
                ", teraddress='" + teraddress + '\'' +
                ", terstatuc=" + terstatuc +
                ", port=" + port +
                ", bps=" + bps +
                ", stoplocal=" + stoplocal +
                ", isselect=" + isselect +
                ", jiou=" + jiou +
                ", unm=" + unm +
                ", baowenouttime=" + baowenouttime +
                ", zijieouttime=" + zijieouttime +
                ", primake='" + primake + '\'' +
                ", terids=" + terids +
                ", ternuitnos=" + ternuitnos +
                ", ternos='" + ternos + '\'' +
                '}';
    }
}
