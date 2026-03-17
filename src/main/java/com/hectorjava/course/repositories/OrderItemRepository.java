package com.hectorjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hectorjava.course.entities.OrderItem;
import com.hectorjava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}