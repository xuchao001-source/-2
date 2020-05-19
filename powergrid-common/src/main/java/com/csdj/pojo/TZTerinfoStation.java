package com.csdj.pojo;

/**
 * 采集临时上线终端终端信息
 */
public class TZTerinfoStation {
    private Integer  terid;
    private Integer  ternuitno;
    private String  terno;
        private String  terip;
        private String teraddress;
        private Integer terstatus;
        private Integer port;
        private Integer  bps;
        private Integer stoplocal;
        private Integer  isselect;
        private Integer jiou;
        private Integer num;
        private  Integer baowenouttime;
        private Integer  zijieouttime;
        private String promake;

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

    public Integer getTerstatus() {
        return terstatus;
    }

    public void setTerstatus(Integer terstatus) {
        this.terstatus = terstatus;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public String getPromake() {
        return promake;
    }

    public void setPromake(String promake) {
        this.promake = promake;
    }

    @Override
    public String toString() {
        return "TZTerinfoStation{" +
                "terid=" + terid +
                ", ternuitno=" + ternuitno +
                ", terno='" + terno + '\'' +
                ", terip='" + terip + '\'' +
                ", teraddress='" + teraddress + '\'' +
                ", terstatus=" + terstatus +
                ", port=" + port +
                ", bps=" + bps +
                ", stoplocal=" + stoplocal +
                ", isselect=" + isselect +
                ", jiou=" + jiou +
                ", num=" + num +
                ", baowenouttime=" + baowenouttime +
                ", zijieouttime=" + zijieouttime +
                ", promake='" + promake + '\'' +
                '}';
    }
}
