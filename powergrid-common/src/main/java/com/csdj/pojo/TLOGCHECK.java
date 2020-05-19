package com.csdj.pojo;

import java.util.Date;

/**
 * 检测日志表
 */
public class TLOGCHECK {
    private Integer logid;
    private String meterno;
    private String  meteraddress;
    private Integer templateid;
    private String  templateanme;
    private Integer templatetype;
    private  Integer operid;
    private String opername;
    private Integer  unitid;
    private String unitname;
    private Date exectime;
    private String  result;
    private String failurereason;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno;
    }

    public String getMeteraddress() {
        return meteraddress;
    }

    public void setMeteraddress(String meteraddress) {
        this.meteraddress = meteraddress;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getTemplateanme() {
        return templateanme;
    }

    public void setTemplateanme(String templateanme) {
        this.templateanme = templateanme;
    }

    public Integer getTemplatetype() {
        return templatetype;
    }

    public void setTemplatetype(Integer templatetype) {
        this.templatetype = templatetype;
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

    public Date getExectime() {
        return exectime;
    }

    public void setExectime(Date exectime) {
        this.exectime = exectime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFailurereason() {
        return failurereason;
    }

    public void setFailurereason(String failurereason) {
        this.failurereason = failurereason;
    }

    @Override
    public String toString() {
        return "TLOGCHECK{" +
                "logid=" + logid +
                ", meterno='" + meterno + '\'' +
                ", meteraddress='" + meteraddress + '\'' +
                ", templateid=" + templateid +
                ", templateanme='" + templateanme + '\'' +
                ", templatetype=" + templatetype +
                ", operid=" + operid +
                ", opername='" + opername + '\'' +
                ", unitid=" + unitid +
                ", unitname='" + unitname + '\'' +
                ", exectime=" + exectime +
                ", result='" + result + '\'' +
                ", failurereason='" + failurereason + '\'' +
                '}';
    }
}
