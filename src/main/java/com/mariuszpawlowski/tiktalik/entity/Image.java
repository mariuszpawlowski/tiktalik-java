package com.mariuszpawlowski.tiktalik.entity;

import com.owlike.genson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-25.
 */
public class Image implements Comparable<Image>{

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("type")
    private String type;

    @JsonProperty("is_public")
    private Boolean isPublic;

    @JsonProperty("description")
    private String description;

    @JsonProperty("create_time")
    private Date createTime;

    @JsonProperty("download_formats")
    private List<String> downloadFormats;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<String> getDownloadFormats() {
        return downloadFormats;
    }

    public void setDownloadFormats(List<String> downloadFormats) {
        this.downloadFormats = downloadFormats;
    }

    public int compareTo(Image o) {
        return this.getCreateTime().compareTo(o.getCreateTime());
    }
}
