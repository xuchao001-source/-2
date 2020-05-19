package com.csdj.pojo;

import java.security.Permission;

/**
 * 单位电表关系表
 */
public class TUnitMeters {
    private Integer  umid;
    private  String umanyid;
    private  String  ummeterno;
    private  String   umcommaddr;
    private String  umaccount;
    private String  umaccountname;
    private String umaddress;
    private String  umlinkman;
    private String  umphone;
    private String  umno;

    public Integer getUmid() {
        return umid;
    }

    public void setUmid(Integer umid) {
        this.umid = umid;
    }

    public String getUmanyid() {
        return umanyid;
    }

    public void setUmanyid(String umanyid) {
        this.umanyid = umanyid;
    }

    public String getUmmeterno() {
        return ummeterno;
    }

    public void setUmmeterno(String ummeterno) {
        this.ummeterno = ummeterno;
    }

    public String getUmcommaddr() {
        return umcommaddr;
    }

    public void setUmcommaddr(String umcommaddr) {
        this.umcommaddr = umcommaddr;
    }

    public String getUmaccount() {
        return umaccount;
    }

    public void setUmaccount(String umaccount) {
        this.umaccount = umaccount;
    }

    public String getUmaccountname() {
        return umaccountname;
    }

    public void setUmaccountname(String umaccountname) {
        this.umaccountname = umaccountname;
    }

    public String getUmaddress() {
        return umaddress;
    }

    public void setUmaddress(String umaddress) {
        this.umaddress = umaddress;
    }

    public String getUmlinkman() {
        return umlinkman;
    }

    public void setUmlinkman(String umlinkman) {
        this.umlinkman = umlinkman;
    }

    public String getUmphone() {
        return umphone;
    }

    public void setUmphone(String umphone) {
        this.umphone = umphone;
    }

    public String getUmno() {
        return umno;
    }

    public void setUmno(String umno) {
        this.umno = umno;
    }

    @Override
    public String toString() {
        return "TUnitMeters{" +
                "umid=" + umid +
                ", umanyid='" + umanyid + '\'' +
                ", ummeterno='" + ummeterno + '\'' +
                ", umcommaddr='" + umcommaddr + '\'' +
                ", umaccount='" + umaccount + '\'' +
                ", umaccountname='" + umaccountname + '\'' +
                ", umaddress='" + umaddress + '\'' +
                ", umlinkman='" + umlinkman + '\'' +
                ", umphone='" + umphone + '\'' +
                ", umno='" + umno + '\'' +
                '}';
    }
}
