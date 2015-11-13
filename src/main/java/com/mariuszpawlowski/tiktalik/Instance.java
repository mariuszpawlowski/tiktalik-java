package com.mariuszpawlowski.tiktalik;

import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-13.
 */
public class Instance {

    private String uuid;
    private String hostname;
    private String owner;
    private String vpsimage_uuid;
    private int state;
    private boolean running;
    //private List<VPSNetInterface> networks;
    //private VPSImage vpsImage;
    private String default_password;
    private String service_name;
    private float gross_cost_per_hour;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVpsimage_uuid() {
        return vpsimage_uuid;
    }

    public void setVpsimage_uuid(String vpsimage_uuid) {
        this.vpsimage_uuid = vpsimage_uuid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
/*
    public List getNetworks() {
        return networks;
    }

    public void setNetworks(List networks) {
        this.networks = networks;
    }

    public VPSImage getVpsImage() {
        return vpsImage;
    }

    public void setVpsImage(VPSImage vpsImage) {
        this.vpsImage = vpsImage;
    }*/

    public String getDefault_password() {
        return default_password;
    }

    public void setDefault_password(String default_password) {
        this.default_password = default_password;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public float getGross_cost_per_hour() {
        return gross_cost_per_hour;
    }

    public void setGross_cost_per_hour(float gross_cost_per_hour) {
        this.gross_cost_per_hour = gross_cost_per_hour;
    }
}
