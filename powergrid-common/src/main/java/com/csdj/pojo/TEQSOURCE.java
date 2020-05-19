package com.csdj.pojo;

import java.util.Date;

/*
*设备批次信息表
* T_EQ_SOURCE
 */
public class TEQSOURCE {
    private Integer  teqsource;
    private String tesbatchno;
    private String  tesrprocuremethod;
    private String  tesprocurepname;
    private Date  tessupplytime;
    private Integer  tesprocurenumber;

    @Override
    public String toString() {
        return "TEQSOURCE{" +
                "teqsource=" + teqsource +
                ", tesbatchno='" + tesbatchno + '\'' +
                ", tesrprocuremethod='" + tesrprocuremethod + '\'' +
                ", tesprocurepname='" + tesprocurepname + '\'' +
                ", tessupplytime=" + tessupplytime +
                ", tesprocurenumber=" + tesprocurenumber +
                '}';
    }

    public Integer getTeqsource() {
        return teqsource;
    }

    public void setTeqsource(Integer teqsource) {
        this.teqsource = teqsource;
    }

    public String getTesbatchno() {
        return tesbatchno;
    }

    public void setTesbatchno(String tesbatchno) {
        this.tesbatchno = tesbatchno;
    }

    public String getTesrprocuremethod() {
        return tesrprocuremethod;
    }

    public void setTesrprocuremethod(String tesrprocuremethod) {
        this.tesrprocuremethod = tesrprocuremethod;
    }

    public String getTesprocurepname() {
        return tesprocurepname;
    }

    public void setTesprocurepname(String tesprocurepname) {
        this.tesprocurepname = tesprocurepname;
    }

    public Date getTessupplytime() {
        return tessupplytime;
    }

    public void setTessupplytime(Date tessupplytime) {
        this.tessupplytime = tessupplytime;
    }

    public Integer getTesprocurenumber() {
        return tesprocurenumber;
    }

    public void setTesprocurenumber(Integer tesprocurenumber) {
        this.tesprocurenumber = tesprocurenumber;
    }
}
