package com.csdj.pojo;

import java.util.Date;

/**
 * \记录掌机创建任务信息
 */
public class TWORKTEMP {
    private Integer wtid;
    private String  wtmeterno;
    private String wtcommadress;
    private String  wtesamno;
    private Integer  wtencrtype;
    private Integer  wttempalteid;
    private Date wtcreatetime;
    private String  wtdatastr;
    private String wtcardno;

    @Override
    public String toString() {
        return "TWORKTEMP{" +
                "wtid=" + wtid +
                ", wtmeterno='" + wtmeterno + '\'' +
                ", wtcommadress='" + wtcommadress + '\'' +
                ", wtesamno='" + wtesamno + '\'' +
                ", wtencrtype=" + wtencrtype +
                ", wttempalteid=" + wttempalteid +
                ", wtcreatetime=" + wtcreatetime +
                ", wtdatastr='" + wtdatastr + '\'' +
                ", wtcardno='" + wtcardno + '\'' +
                '}';
    }

    public Integer getWtid() {
        return wtid;
    }

    public void setWtid(Integer wtid) {
        this.wtid = wtid;
    }

    public String getWtmeterno() {
        return wtmeterno;
    }

    public void setWtmeterno(String wtmeterno) {
        this.wtmeterno = wtmeterno;
    }

    public String getWtcommadress() {
        return wtcommadress;
    }

    public void setWtcommadress(String wtcommadress) {
        this.wtcommadress = wtcommadress;
    }

    public String getWtesamno() {
        return wtesamno;
    }

    public void setWtesamno(String wtesamno) {
        this.wtesamno = wtesamno;
    }

    public Integer getWtencrtype() {
        return wtencrtype;
    }

    public void setWtencrtype(Integer wtencrtype) {
        this.wtencrtype = wtencrtype;
    }

    public Integer getWttempalteid() {
        return wttempalteid;
    }

    public void setWttempalteid(Integer wttempalteid) {
        this.wttempalteid = wttempalteid;
    }

    public Date getWtcreatetime() {
        return wtcreatetime;
    }

    public void setWtcreatetime(Date wtcreatetime) {
        this.wtcreatetime = wtcreatetime;
    }

    public String getWtdatastr() {
        return wtdatastr;
    }

    public void setWtdatastr(String wtdatastr) {
        this.wtdatastr = wtdatastr;
    }

    public String getWtcardno() {
        return wtcardno;
    }

    public void setWtcardno(String wtcardno) {
        this.wtcardno = wtcardno;
    }
}
