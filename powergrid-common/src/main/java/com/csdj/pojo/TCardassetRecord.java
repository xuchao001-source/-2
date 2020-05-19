package com.csdj.pojo;

import java.util.Date;

public class TCardassetRecord {
    private Integer rcardid;
    private Integer cardid;
    private String cardname;
    private Integer rorgno;
    private String rorgname;
    private Integer rcardlstuserid;
    private String rcardlstuser;
    private Date rcardlsttime;
    private String rcontent;

    public Integer getRcardid() {
        return rcardid;
    }

    public void setRcardid(Integer rcardid) {
        this.rcardid = rcardid;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public Integer getRorgno() {
        return rorgno;
    }

    public void setRorgno(Integer rorgno) {
        this.rorgno = rorgno;
    }

    public String getRorgname() {
        return rorgname;
    }

    public void setRorgname(String rorgname) {
        this.rorgname = rorgname;
    }

    public Integer getRcardlstuserid() {
        return rcardlstuserid;
    }

    public void setRcardlstuserid(Integer rcardlstuserid) {
        this.rcardlstuserid = rcardlstuserid;
    }

    public String getRcardlstuser() {
        return rcardlstuser;
    }

    public void setRcardlstuser(String rcardlstuser) {
        this.rcardlstuser = rcardlstuser;
    }

    public Date getRcardlsttime() {
        return rcardlsttime;
    }

    public void setRcardlsttime(Date rcardlsttime) {
        this.rcardlsttime = rcardlsttime;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }
}
