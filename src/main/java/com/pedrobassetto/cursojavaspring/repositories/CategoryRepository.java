package com.pedrobassetto.cursojavaspring.repositories;

import com.pedrobassetto.cursojavaspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
