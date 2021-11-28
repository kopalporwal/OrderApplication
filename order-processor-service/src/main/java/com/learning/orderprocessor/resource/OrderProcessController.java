package com.learning.orderprocessor.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.orderprocessor.model.OrderRequest;
import com.learning.orderprocessor.model.OrderResponse;
import com.learning.orderprocessor.service.OrderService;
import com.learning.orderprocessor.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProcessController {
    @RequestMapping("/orders")
    public OrderResponse createOrder(@RequestBody String request){

        ObjectMapper mapperObj = new ObjectMapper();
        OrderResponse response=null;
        try {
            OrderRequest orderRequest=mapperObj.readValue(request, OrderRequest.class);
            response=new OrderServiceImpl().processOrderPayment(orderRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return response;
    }

}
