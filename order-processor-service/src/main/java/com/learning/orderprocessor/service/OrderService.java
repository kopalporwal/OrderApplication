package com.learning.orderprocessor.service;

import com.learning.orderprocessor.model.OrderRequest;
import com.learning.orderprocessor.model.OrderResponse;

public interface OrderService {

    public OrderResponse processOrderPayment(OrderRequest orderRequest);
}
