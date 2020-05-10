package com.pedrobassetto.cursojavaspring.repositories;

import com.pedrobassetto.cursojavaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
