package com.learncoding.oderservice.service;

import com.learncoding.oderservice.entity.OrderMaterials;
import com.learncoding.oderservice.repository.OrderMaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderMaterialService {

    @Autowired
    private OrderMaterialsRepository orderMaterialsRepository;

    public List<OrderMaterials> getAllOrders() {

        return orderMaterialsRepository.findAll();
    }

    public Optional<OrderMaterials> getOrderById(int id) {

        return orderMaterialsRepository.findById(id);
    }

    public OrderMaterials createOrder(OrderMaterials orderMaterials) {
        return orderMaterialsRepository.save(orderMaterials);
    }

    public boolean deleteOrder(int id) {
        if (orderMaterialsRepository.existsById(id)) {
            orderMaterialsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
