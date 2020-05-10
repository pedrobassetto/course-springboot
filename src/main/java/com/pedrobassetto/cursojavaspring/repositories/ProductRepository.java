package com.pedrobassetto.cursojavaspring.repositories;

import com.pedrobassetto.cursojavaspring.entities.Category;
import com.pedrobassetto.cursojavaspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
