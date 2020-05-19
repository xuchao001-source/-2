package com.csdj.pojo;

/**
 * gprs与单位关系表
 */
public class TGprsUnit {
    private Integer id;
    private Integer aid;
    private Integer muid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getMuid() {
        return muid;
    }

    public void setMuid(Integer muid) {
        this.muid = muid;
    }

    @Override
    public String toString() {
        return "TGprsUnit{" +
                "id=" + id +
                ", aid=" + aid +
                ", muid=" + muid +
                '}';
    }
}
