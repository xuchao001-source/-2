package com.csdj.pojo;

/**
 * 安全单元升级表
 */
public class TSafeVersionSoftware {
    private Integer  id;
    private String  version;
    private String  hardware;
    private Integer corder;
    private String  data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public Integer getCorder() {
        return corder;
    }

    public void setCorder(Integer corder) {
        this.corder = corder;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TSafeVersionSoftware{" +
                "id=" + id +
                ", version='" + version + '\'' +
                ", hardware='" + hardware + '\'' +
                ", corder=" + corder +
                ", data='" + data + '\'' +
                '}';
    }
}
