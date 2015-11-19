package com.mariuszpawlowski.tiktalik.entity;

import com.owlike.genson.annotation.JsonProperty;

/**
 * Created by Mariusz.Pawlowski on 2015-11-19.
 */
public class Interface {

    @JsonProperty("vps")
    private String vps;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("seq")
    private Integer seq;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("floating")
    private Boolean floating;

    @JsonProperty("network")
    private Network network;

    public String getVps() {
        return vps;
    }

    public void setVps(String vps) {
        this.vps = vps;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Boolean getFloating() {
        return floating;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
