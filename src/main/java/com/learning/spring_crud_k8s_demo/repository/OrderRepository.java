package com.learning.spring_crud_k8s_demo.repository;

import com.learning.spring_crud_k8s_demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
