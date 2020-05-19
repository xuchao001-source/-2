package com.csdj.pojo;

/**
 * 电表权限表
 */
public class TMeterinfoKey {
    private Integer id;
    private Integer  msiid;
    private Integer keytype;
    private String  div;
    private String  keydata;
    private Integer keynum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsiid() {
        return msiid;
    }

    public void setMsiid(Integer msiid) {
        this.msiid = msiid;
    }

    public Integer getKeytype() {
        return keytype;
    }

    public void setKeytype(Integer keytype) {
        this.keytype = keytype;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getKeydata() {
        return keydata;
    }

    public void setKeydata(String keydata) {
        this.keydata = keydata;
    }

    public Integer getKeynum() {
        return keynum;
    }

    public void setKeynum(Integer keynum) {
        this.keynum = keynum;
    }

    @Override
    public String toString() {
        return "TMeterinfoKey{" +
                "id=" + id +
                ", msiid=" + msiid +
                ", keytype=" + keytype +
                ", div='" + div + '\'' +
                ", keydata='" + keydata + '\'' +
                ", keynum=" + keynum +
                '}';
    }
}
