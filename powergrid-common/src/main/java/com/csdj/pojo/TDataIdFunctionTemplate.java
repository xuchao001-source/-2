package com.csdj.pojo;

/**
 * 采集645模板信息
 */
public class TDataIdFunctionTemplate {
    private Integer id;
    private String name;
    private Integer  managerunit;
    private String  remark;

    @Override
    public String toString() {
        return "TDataIdFunctionTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerunit=" + managerunit +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManagerunit() {
        return managerunit;
    }

    public void setManagerunit(Integer managerunit) {
        this.managerunit = managerunit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
