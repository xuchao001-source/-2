package com.csdj.pojo;

import java.util.Date;

/**\
 *采集集中器事件上报表
 */
public class TMeterEventReport {
    private Integer id;
    private String eventname;
    private Date  reporttime;
    private Integer status;
    private Integer  tmid;

    @Override
    public String toString() {
        return "TMeterEventReport{" +
                "id=" + id +
                ", eventname='" + eventname + '\'' +
                ", reporttime=" + reporttime +
                ", status=" + status +
                ", tmid=" + tmid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }
}
