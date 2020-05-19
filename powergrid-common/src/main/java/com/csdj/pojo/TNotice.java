package com.csdj.pojo;

import java.util.Date;

/**
 * 公告信息表
 */
public class TNotice {
    private Integer id;
    private String titile;
    private Date  uptime;
    private String  content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TNotice{" +
                "id=" + id +
                ", titile='" + titile + '\'' +
                ", uptime=" + uptime +
                ", content='" + content + '\'' +
                '}';
    }
}
