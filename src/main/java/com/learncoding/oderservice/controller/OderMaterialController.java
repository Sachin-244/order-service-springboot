package com.learncoding.oderservice.controller;

import com.learncoding.oderservice.entity.OrderMaterials;
import com.learncoding.oderservice.service.OrderMaterialService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OderMaterialController {

    @Autowired
    private final OrderMaterialService orderMaterialService;

    public OderMaterialController(OrderMaterialService orderMaterialService) {
        this.orderMaterialService = orderMaterialService;
    }


    @GetMapping("/get-orders")
    public ResponseEntity<List<OrderMaterials>> getAllOrders() {
        List<OrderMaterials> orders = orderMaterialService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/get-order/{id}")
    public ResponseEntity<OrderMaterials> getOrderById(@PathVariable int id) {
        Optional<OrderMaterials> orderMaterials = orderMaterialService.getOrderById(id);
        if (orderMaterials.isPresent()) {
            return new ResponseEntity<>(orderMaterials.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create-order")
    public ResponseEntity<OrderMaterials> createOrder(@RequestBody OrderMaterials orderMaterials) {
        System.out.println(" called =============");
        OrderMaterials createdOrder = orderMaterialService.createOrder(orderMaterials);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete-order/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable int id) {
        boolean deleted = orderMaterialService.deleteOrder(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}



