package com.francodev.discoveryserver.orderservice.repository;

import com.francodev.discoveryserver.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
