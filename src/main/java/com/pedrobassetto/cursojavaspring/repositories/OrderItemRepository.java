package com.pedrobassetto.cursojavaspring.repositories;

import com.pedrobassetto.cursojavaspring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
