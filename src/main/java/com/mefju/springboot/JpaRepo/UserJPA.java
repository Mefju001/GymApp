package com.mefju.springboot.JpaRepo;

import com.mefju.springboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<User, String> {
}
