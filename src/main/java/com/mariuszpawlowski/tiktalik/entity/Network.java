package com.mariuszpawlowski.tiktalik.entity;

import com.owlike.genson.annotation.JsonProperty;

/**
 * Created by Mariusz.Pawlowski on 2015-11-19.
 */
public class Network {

    @JsonProperty("full")
    private Boolean full;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("domainname")
    private String domainname;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("net")
    private String net;

    @JsonProperty("public")
    private Boolean _public;

    @JsonProperty("name")
    private String name;

    public Boolean getFull() {
        return full;
    }

    public void setFull(Boolean full) {
        this.full = full;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Boolean get_public() {
        return _public;
    }

    public void set_public(Boolean _public) {
        this._public = _public;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
