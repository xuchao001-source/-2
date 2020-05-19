package com.csdj.pojo;

import java.util.Date;

/**
 * 电表对时日志信息
 */
public class TTimelog {
    private Integer id;
    private String meterno;
    private String  commadress;
    private Integer  type;
    private Date opertime;
    private  Integer result;
    private Integer errortype;
    private Integer operid;
    private String  opername;
    private Integer  unitid;
    private String  unitname;
    private String  datainfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno;
    }

    public String getCommadress() {
        return commadress;
    }

    public void setCommadress(String commadress) {
        this.commadress = commadress;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getErrortype() {
        return errortype;
    }

    public void setErrortype(Integer errortype) {
        this.errortype = errortype;
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

    public String getDatainfo() {
        return datainfo;
    }

    public void setDatainfo(String datainfo) {
        this.datainfo = datainfo;
    }

    @Override
    public String toString() {
        return "TTimelog{" +
                "id=" + id +
                ", meterno='" + meterno + '\'' +
                ", commadress='" + commadress + '\'' +
                ", type=" + type +
                ", opertime=" + opertime +
                ", result=" + result +
                ", errortype=" + errortype +
                ", operid=" + operid +
                ", opername='" + opername + '\'' +
                ", unitid=" + unitid +
                ", unitname='" + unitname + '\'' +
                ", datainfo='" + datainfo + '\'' +
                '}';
    }
}