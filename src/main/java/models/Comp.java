package models;

public class Comp {
    private Integer id;
    private String gpu;
    private String cpu;
    private String osVersion;
    private Os osType;
    private String motherboard;

    public Comp(){}

    public Comp(Integer id, String gpu, String cpu, String osVersion, Os osType, String motherboard) {
        this.id = id;
        this.gpu = gpu;
        this.cpu = cpu;
        this.osVersion = osVersion;
        this.osType = osType;
        this.motherboard = motherboard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Os getOsType() {
        return osType;
    }

    public void setOsType(Os osType) {
        this.osType = osType;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
}
