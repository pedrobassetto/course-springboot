package com.pedrobassetto.cursojavaspring.repositories;

import com.pedrobassetto.cursojavaspring.entities.Order;
import com.pedrobassetto.cursojavaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
