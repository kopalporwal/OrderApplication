package com.learning.orderprocessor.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductType {

    @JsonProperty("type")
    private String type;

    @JsonProperty("description")
    private String desc;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
