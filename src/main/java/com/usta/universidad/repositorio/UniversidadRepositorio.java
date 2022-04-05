package com.usta.universidad.repositorio;

import com.usta.universidad.model.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversidadRepositorio extends JpaRepository<Universidad,Long> {
}
