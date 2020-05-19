package com.csdj.pojo;

/**
 * 角色表
 */
public class TUserRose {
    private Integer rid;
    private String rname;
    private String rno;
    private String  rright;
    private Integer isuser;
    private Integer rids;

    @Override
    public String toString() {
        return "TUserRose{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rno='" + rno + '\'' +
                ", rright='" + rright + '\'' +
                ", isuser=" + isuser +
                ", rids=" + rids +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getRright() {
        return rright;
    }

    public void setRright(String rright) {
        this.rright = rright;
    }

    public Integer getIsuser() {
        return isuser;
    }

    public void setIsuser(Integer isuser) {
        this.isuser = isuser;
    }

    public Integer getRids() {
        return rids;
    }

    public void setRids(Integer rids) {
        this.rids = rids;
    }
}
