package com.csdj.pojo;

/**
 * 模版类型表
 */
public class TTemplateType {
    private  Integer  ttid;
    private  String  tttitle;
    private  Integer  tttype;
    private  String  ttkeys;
    private Integer ttmemo;

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public String getTttitle() {
        return tttitle;
    }

    public void setTttitle(String tttitle) {
        this.tttitle = tttitle;
    }

    public Integer getTttype() {
        return tttype;
    }

    public void setTttype(Integer tttype) {
        this.tttype = tttype;
    }

    public String getTtkeys() {
        return ttkeys;
    }

    public void setTtkeys(String ttkeys) {
        this.ttkeys = ttkeys;
    }

    public Integer getTtmemo() {
        return ttmemo;
    }

    public void setTtmemo(Integer ttmemo) {
        this.ttmemo = ttmemo;
    }

    @Override
    public String toString() {
        return "TTemplateType{" +
                "ttid=" + ttid +
                ", tttitle='" + tttitle + '\'' +
                ", tttype=" + tttype +
                ", ttkeys='" + ttkeys + '\'' +
                ", ttmemo=" + ttmemo +
                '}';
    }
}

