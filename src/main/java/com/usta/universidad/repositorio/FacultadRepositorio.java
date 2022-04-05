package com.usta.universidad.repositorio;

import com.usta.universidad.model.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultadRepositorio extends JpaRepository<Facultad, Long> {
}
