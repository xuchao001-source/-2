package com.csdj.pojo;

/**
 * 系统参数表
 */
public class TSystemParameter {
   private  String  spkey;
   private  String  spvalue;

    public String getSpkey() {
        return spkey;
    }

    public void setSpkey(String spkey) {
        this.spkey = spkey;
    }

    public String getSpvalue() {
        return spvalue;
    }

    public void setSpvalue(String spvalue) {
        this.spvalue = spvalue;
    }

    @Override
    public String toString() {
        return "TSystemParameter{" +
                "spkey='" + spkey + '\'' +
                ", spvalue='" + spvalue + '\'' +
                '}';
    }
}
