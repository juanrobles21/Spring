package com.usta.universidad.repositorio;

import com.usta.universidad.model.Asignaturas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturasRepositorio extends JpaRepository<Asignaturas,Long> {
}
