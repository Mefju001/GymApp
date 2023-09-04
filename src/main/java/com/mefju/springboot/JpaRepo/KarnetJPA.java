package com.mefju.springboot.JpaRepo;

import com.mefju.springboot.Entity.Karnet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KarnetJPA extends JpaRepository<Karnet, Integer>{
}
