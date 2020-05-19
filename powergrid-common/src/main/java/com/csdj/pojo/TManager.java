package com.csdj.pojo;

import com.sun.javafx.image.IntPixelGetter;

/**
 * 管理员信息表
 */
public class TManager {
        private Integer mid;
        private Integer mmanageunit;
        private  String maccount;
        private  String mpasswd;
        private  String mauthority;
        private  String manme;
        private  String mphone;
        private  String mmemo;
        private  String mrose;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMmanageunit() {
        return mmanageunit;
    }

    public void setMmanageunit(Integer mmanageunit) {
        this.mmanageunit = mmanageunit;
    }

    public String getMaccount() {
        return maccount;
    }

    public void setMaccount(String maccount) {
        this.maccount = maccount;
    }

    public String getMpasswd() {
        return mpasswd;
    }

    public void setMpasswd(String mpasswd) {
        this.mpasswd = mpasswd;
    }

    public String getMauthority() {
        return mauthority;
    }

    public void setMauthority(String mauthority) {
        this.mauthority = mauthority;
    }

    public String getManme() {
        return manme;
    }

    public void setManme(String manme) {
        this.manme = manme;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMmemo() {
        return mmemo;
    }

    public void setMmemo(String mmemo) {
        this.mmemo = mmemo;
    }

    public String getMrose() {
        return mrose;
    }

    public void setMrose(String mrose) {
        this.mrose = mrose;
    }

    @Override
    public String toString() {
        return "TManager{" +
                "mid=" + mid +
                ", mmanageunit=" + mmanageunit +
                ", maccount='" + maccount + '\'' +
                ", mpasswd='" + mpasswd + '\'' +
                ", mauthority='" + mauthority + '\'' +
                ", manme='" + manme + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mmemo='" + mmemo + '\'' +
                ", mrose='" + mrose + '\'' +
                '}';
    }
}
