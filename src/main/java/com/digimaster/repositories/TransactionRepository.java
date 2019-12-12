package com.digimaster.repositories;

import com.digimaster.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository
@Repository
public interface TransactionRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
