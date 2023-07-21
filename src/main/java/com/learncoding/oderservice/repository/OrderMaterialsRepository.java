package com.learncoding.oderservice.repository;

import com.learncoding.oderservice.entity.OrderMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMaterialsRepository extends JpaRepository<OrderMaterials, Integer> {
}

