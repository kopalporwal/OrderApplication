package com.learning.orderprocessor.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderRequest {

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("product")
    private Product product;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
