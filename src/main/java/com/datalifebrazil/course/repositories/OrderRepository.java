package com.datalifebrazil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datalifebrazil.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
