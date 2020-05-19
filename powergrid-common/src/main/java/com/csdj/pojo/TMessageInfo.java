package com.csdj.pojo;

import java.util.Date;

/**
 * 报文信息
 */
public class TMessageInfo {
    private Integer  tmid;
    private Integer tmdetectionid;
    private Date tmmessagetime;
    private String  tmmessage;

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }

    public Integer getTmdetectionid() {
        return tmdetectionid;
    }

    public void setTmdetectionid(Integer tmdetectionid) {
        this.tmdetectionid = tmdetectionid;
    }

    public Date getTmmessagetime() {
        return tmmessagetime;
    }

    public void setTmmessagetime(Date tmmessagetime) {
        this.tmmessagetime = tmmessagetime;
    }

    public String getTmmessage() {
        return tmmessage;
    }

    public void setTmmessage(String tmmessage) {
        this.tmmessage = tmmessage;
    }

    @Override
    public String toString() {
        return "TMessageInfo{" +
                "tmid=" + tmid +
                ", tmdetectionid=" + tmdetectionid +
                ", tmmessagetime=" + tmmessagetime +
                ", tmmessage='" + tmmessage + '\'' +
                '}';
    }
}
