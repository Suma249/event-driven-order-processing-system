package com.learning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
