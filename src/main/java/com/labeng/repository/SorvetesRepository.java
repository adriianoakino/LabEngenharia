package com.labeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labeng.entities.Sorvetes;

@Repository
public interface SorvetesRepository extends JpaRepository<Sorvetes, Long> {
    
}
