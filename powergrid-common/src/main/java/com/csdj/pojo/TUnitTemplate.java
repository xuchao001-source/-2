package com.csdj.pojo;
/**
 * 模板单位关系表5
 */
public class TUnitTemplate {
        private Integer tutid;
        private Integer tutunitid;
        private Integer  tuttemid;

    @Override
    public String toString() {
        return "TUnitTemplate{" +
                "tutid=" + tutid +
                ", tutunitid=" + tutunitid +
                ", tuttemid=" + tuttemid +
                '}';
    }

    public Integer getTutid() {
        return tutid;
    }

    public void setTutid(Integer tutid) {
        this.tutid = tutid;
    }

    public Integer getTutunitid() {
        return tutunitid;
    }

    public void setTutunitid(Integer tutunitid) {
        this.tutunitid = tutunitid;
    }

    public Integer getTuttemid() {
        return tuttemid;
    }

    public void setTuttemid(Integer tuttemid) {
        this.tuttemid = tuttemid;
    }
}
