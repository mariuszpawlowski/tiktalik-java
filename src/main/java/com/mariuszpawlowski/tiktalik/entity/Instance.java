package com.mariuszpawlowski.tiktalik.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-13.
 */
public class Instance implements Serializable {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

