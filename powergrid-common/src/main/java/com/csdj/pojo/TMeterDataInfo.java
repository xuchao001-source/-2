package com.csdj.pojo;

/**
 * 电表数据信息表
 */
public class TMeterDataInfo {
    private  Integer  mdiid;
     private String mdidatanO07;
     private  Integer  mdiformat07;
     private String  mdidatanO97;
     private  Integer  mdiformat97;
     private  String  mditile;
     private  String  mdiunit;
     private  Integer  mditype;
     private  Integer  mdirw;
      private  String mdimemo;

    public Integer getMdiid() {
        return mdiid;
    }

    public void setMdiid(Integer mdiid) {
        this.mdiid = mdiid;
    }

    public String getMdidatanO07() {
        return mdidatanO07;
    }

    public void setMdidatanO07(String mdidatanO07) {
        this.mdidatanO07 = mdidatanO07;
    }

    public Integer getMdiformat07() {
        return mdiformat07;
    }

    public void setMdiformat07(Integer mdiformat07) {
        this.mdiformat07 = mdiformat07;
    }

    public String getMdidatanO97() {
        return mdidatanO97;
    }

    public void setMdidatanO97(String mdidatanO97) {
        this.mdidatanO97 = mdidatanO97;
    }

    public Integer getMdiformat97() {
        return mdiformat97;
    }

    public void setMdiformat97(Integer mdiformat97) {
        this.mdiformat97 = mdiformat97;
    }

    public String getMditile() {
        return mditile;
    }

    public void setMditile(String mditile) {
        this.mditile = mditile;
    }

    public String getMdiunit() {
        return mdiunit;
    }

    public void setMdiunit(String mdiunit) {
        this.mdiunit = mdiunit;
    }

    public Integer getMditype() {
        return mditype;
    }

    public void setMditype(Integer mditype) {
        this.mditype = mditype;
    }

    public Integer getMdirw() {
        return mdirw;
    }

    public void setMdirw(Integer mdirw) {
        this.mdirw = mdirw;
    }

    public String getMdimemo() {
        return mdimemo;
    }

    public void setMdimemo(String mdimemo) {
        this.mdimemo = mdimemo;
    }

    @Override
    public String toString() {
        return "TMeterDataInfo{" +
                "mdiid=" + mdiid +
                ", mdidatanO07='" + mdidatanO07 + '\'' +
                ", mdiformat07=" + mdiformat07 +
                ", mdidatanO97='" + mdidatanO97 + '\'' +
                ", mdiformat97=" + mdiformat97 +
                ", mditile='" + mditile + '\'' +
                ", mdiunit='" + mdiunit + '\'' +
                ", mditype=" + mditype +
                ", mdirw=" + mdirw +
                ", mdimemo='" + mdimemo + '\'' +
                '}';
    }
}
