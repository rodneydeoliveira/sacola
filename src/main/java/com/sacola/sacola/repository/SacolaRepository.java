package com.sacola.sacola.repository;

import com.sacola.sacola.models.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
