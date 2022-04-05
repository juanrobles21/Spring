package com.usta.universidad.repositorio;

import com.usta.universidad.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepositorio extends JpaRepository<Docente,Long> {
}
