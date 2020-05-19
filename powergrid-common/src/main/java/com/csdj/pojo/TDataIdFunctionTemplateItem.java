package com.csdj.pojo;

/**
 * 采集模板下的645命令信息
 */
public class TDataIdFunctionTemplateItem {
    private Integer id;
    private String name;
    private Integer  dataidfuntionid;
    private Integer  superior;
    private String  datavalue;

    @Override
    public String toString() {
        return "TDataIdFunctionTemplateItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataidfuntionid=" + dataidfuntionid +
                ", superior=" + superior +
                ", datavalue='" + datavalue + '\'' +
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

    public Integer getDataidfuntionid() {
        return dataidfuntionid;
    }

    public void setDataidfuntionid(Integer dataidfuntionid) {
        this.dataidfuntionid = dataidfuntionid;
    }

    public Integer getSuperior() {
        return superior;
    }

    public void setSuperior(Integer superior) {
        this.superior = superior;
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue;
    }
}
