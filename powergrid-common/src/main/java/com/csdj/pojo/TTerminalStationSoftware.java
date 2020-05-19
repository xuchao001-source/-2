package com.csdj.pojo;

import java.util.Date;

/**
 * 采集集中器升级软件
 */
public class TTerminalStationSoftware {
    private Integer id;
    private String  versionno;
    private String versionname;
    private Date uploaddate;
    private String filepath;
    private String  fikename;
    private String memo;
    private String vender;
    private Integer ids;

    @Override
    public String toString() {
        return "TTerminalStationSoftware{" +
                "id=" + id +
                ", versionno='" + versionno + '\'' +
                ", versionname='" + versionname + '\'' +
                ", uploaddate=" + uploaddate +
                ", filepath='" + filepath + '\'' +
                ", fikename='" + fikename + '\'' +
                ", memo='" + memo + '\'' +
                ", vender='" + vender + '\'' +
                ", ids=" + ids +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionno() {
        return versionno;
    }

    public void setVersionno(String versionno) {
        this.versionno = versionno;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFikename() {
        return fikename;
    }

    public void setFikename(String fikename) {
        this.fikename = fikename;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }
}
