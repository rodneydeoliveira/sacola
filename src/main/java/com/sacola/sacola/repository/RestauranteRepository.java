package com.sacola.sacola.repository;

import com.sacola.sacola.models.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
