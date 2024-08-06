package com.datalifebrazil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datalifebrazil.course.entities.OrderItem;
import com.datalifebrazil.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
