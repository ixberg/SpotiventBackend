package com.Spotivent.SpotiventBackend.orderItem.repository;

import com.Spotivent.SpotiventBackend.orderItem.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItems, Long> {
}