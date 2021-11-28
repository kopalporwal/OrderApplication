package com.learning.orderprocessor.service;

import com.learning.orderprocessor.model.OrderRequest;
import com.learning.orderprocessor.model.OrderResponse;
import com.learning.orderprocessor.model.Product;
import com.learning.orderprocessor.model.ProductType;

public class OrderServiceImpl implements OrderService{
    @Override
    public OrderResponse processOrderPayment(OrderRequest orderRequest) {

        OrderResponse response=new OrderResponse();
        response.setAccountId(orderRequest.getAccountId());
        response.setOrderId(orderRequest.getOrderId());
        response.setProduct(orderRequest.getProduct());

        if(orderRequest.getProduct().getProductType().getType().equals("physical product")){
            response.setResponseMessage("A packing slip for shipping is generated.");
            if(orderRequest.getProduct().getName().equals("Book")){
                response.setResponseMessage("a duplicate packing slip for the royalty department.");
            }
        }else if(orderRequest.getProduct().getProductType().getType().equals("membership")){
            response.setResponseMessage("Membership is activated.");
            //Membership logic has to be applied here.
        }else if(orderRequest.getProduct().getProductType().getType().equals("Video")){
            if(orderRequest.getProduct().getName().equals("Learning to Ski")) {
                response.setResponseMessage("A free “First Aid” video to the packing slip is generated");
            }
        }
        return response;
    }
}
