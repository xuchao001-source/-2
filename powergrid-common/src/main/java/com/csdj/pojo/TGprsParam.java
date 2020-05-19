package com.csdj.pojo;

/**
 * gprs参数表
 */
public class TGprsParam {
    private Integer aid;
    private String apn;
    private String  apnuser;
    private String apnpasswd;
    private String  apnip;
    private String  apnport;

    @Override
    public String toString() {
        return "TGprsParam{" +
                "aid=" + aid +
                ", apn='" + apn + '\'' +
                ", apnuser='" + apnuser + '\'' +
                ", apnpasswd='" + apnpasswd + '\'' +
                ", apnip='" + apnip + '\'' +
                ", apnport='" + apnport + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getApnuser() {
        return apnuser;
    }

    public void setApnuser(String apnuser) {
        this.apnuser = apnuser;
    }

    public String getApnpasswd() {
        return apnpasswd;
    }

    public void setApnpasswd(String apnpasswd) {
        this.apnpasswd = apnpasswd;
    }

    public String getApnip() {
        return apnip;
    }

    public void setApnip(String apnip) {
        this.apnip = apnip;
    }

    public String getApnport() {
        return apnport;
    }

    public void setApnport(String apnport) {
        this.apnport = apnport;
    }
}
