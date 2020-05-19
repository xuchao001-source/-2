package com.csdj.pojo;

import java.util.Date;

/**
 * 操作员卡黑名单
 */
public class TCardBlacklist {
    private  Integer  cbid;
    private  Integer  cbseccardid;
    private Date cbjointime;
    private  Date cblocktime;
    private  String  cbmemo;

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getCbseccardid() {
        return cbseccardid;
    }

    public void setCbseccardid(Integer cbseccardid) {
        this.cbseccardid = cbseccardid;
    }

    public Date getCbjointime() {
        return cbjointime;
    }

    public void setCbjointime(Date cbjointime) {
        this.cbjointime = cbjointime;
    }

    public Date getCblocktime() {
        return cblocktime;
    }

    public void setCblocktime(Date cblocktime) {
        this.cblocktime = cblocktime;
    }

    public String getCbmemo() {
        return cbmemo;
    }

    public void setCbmemo(String cbmemo) {
        this.cbmemo = cbmemo;
    }

    @Override
    public String toString() {
        return "TCardBlacklist{" +
                "cbid=" + cbid +
                ", cbseccardid=" + cbseccardid +
                ", cbjointime=" + cbjointime +
                ", cblocktime=" + cblocktime +
                ", cbmemo='" + cbmemo + '\'' +
                '}';
    }
}
