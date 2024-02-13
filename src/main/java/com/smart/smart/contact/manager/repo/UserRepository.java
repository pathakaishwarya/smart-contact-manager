package com.smart.smart.contact.manager.repo;

import com.smart.smart.contact.manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
