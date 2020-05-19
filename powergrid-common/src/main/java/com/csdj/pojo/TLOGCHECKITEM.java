package com.csdj.pojo;

/**
 * 检测日志明细表
 */
public class TLOGCHECKITEM {
    private Integer  logitemid;
    private Integer  logid;
    private String  dataid;
    private String  operatecommand;
    private Integer valuelength;
    private  String  value;
    private String result;
    private String esamnum;
    private Integer addlength;
    private String  addcontent;

    public Integer getLogitemid() {
        return logitemid;
    }

    public void setLogitemid(Integer logitemid) {
        this.logitemid = logitemid;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getOperatecommand() {
        return operatecommand;
    }

    public void setOperatecommand(String operatecommand) {
        this.operatecommand = operatecommand;
    }

    public Integer getValuelength() {
        return valuelength;
    }

    public void setValuelength(Integer valuelength) {
        this.valuelength = valuelength;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEsamnum() {
        return esamnum;
    }

    public void setEsamnum(String esamnum) {
        this.esamnum = esamnum;
    }

    public Integer getAddlength() {
        return addlength;
    }

    public void setAddlength(Integer addlength) {
        this.addlength = addlength;
    }

    public String getAddcontent() {
        return addcontent;
    }

    public void setAddcontent(String addcontent) {
        this.addcontent = addcontent;
    }

    @Override
    public String toString() {
        return "TLOGCHECKITEM{" +
                "logitemid=" + logitemid +
                ", logid=" + logid +
                ", dataid='" + dataid + '\'' +
                ", operatecommand='" + operatecommand + '\'' +
                ", valuelength=" + valuelength +
                ", value='" + value + '\'' +
                ", result='" + result + '\'' +
                ", esamnum='" + esamnum + '\'' +
                ", addlength=" + addlength +
                ", addcontent='" + addcontent + '\'' +
                '}';
    }
}
