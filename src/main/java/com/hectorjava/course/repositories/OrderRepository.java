package com.hectorjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hectorjava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
