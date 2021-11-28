package com.learning.orderprocessor.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderResponse {

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

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("product")
    private Product product;

    @JsonProperty("message")
    private String responseMessage;

    @JsonProperty("order_status")
    private String orderStatus;


}
