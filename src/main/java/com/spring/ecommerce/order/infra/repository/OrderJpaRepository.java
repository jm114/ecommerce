package com.spring.ecommerce.order.infra.repository;

import com.spring.ecommerce.order.infra.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
