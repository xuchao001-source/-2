package com.csdj.pojo;

/**
 * 安全单元版本表
 */
public class TSafeversion {
    private String  version;
    private String  softname;
    private String  hardware;
    private String  detatls;
    private Integer  irauth;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSoftname() {
        return softname;
    }

    public void setSoftname(String softname) {
        this.softname = softname;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getDetatls() {
        return detatls;
    }

    public void setDetatls(String detatls) {
        this.detatls = detatls;
    }

    public Integer getIrauth() {
        return irauth;
    }

    public void setIrauth(Integer irauth) {
        this.irauth = irauth;
    }

    @Override
    public String toString() {
        return "TSafeversion{" +
                "version='" + version + '\'' +
                ", softname='" + softname + '\'' +
                ", hardware='" + hardware + '\'' +
                ", detatls='" + detatls + '\'' +
                ", irauth=" + irauth +
                '}';
    }
}
