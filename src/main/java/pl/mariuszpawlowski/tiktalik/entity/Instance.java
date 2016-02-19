package pl.mariuszpawlowski.tiktalik.entity;

import com.mariuszpawlowski.tiktalik.entity.*;
import com.owlike.genson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-13.
 */
public class Instance implements Serializable {

    @JsonProperty("size")
    private Integer size;

    @JsonProperty("state")
    private Integer state;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("service_name")
    private String serviceName;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("default_password")
    private String defaultPassword;

    @JsonProperty("interfaces")
    private List<Interface> interfaces = new ArrayList<Interface>();

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("running")
    private Boolean running;

    @JsonProperty("vpsimage_uuid")
    private String vpsimageUuid;

    @JsonProperty("actions_pending_count")
    private String actionsPendingCount;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public String getVpsimageUuid() {
        return vpsimageUuid;
    }

    public void setVpsimageUuid(String vpsimageUuid) {
        this.vpsimageUuid = vpsimageUuid;
    }

    public String getActionsPendingCount() {
        return actionsPendingCount;
    }

    public void setActionsPendingCount(String actionsPendingCount) {
        this.actionsPendingCount = actionsPendingCount;
    }
}

