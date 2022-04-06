package com.usta.universidad.repositorio;

import com.usta.universidad.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocenteRepositorio extends JpaRepository<Docente,Long> {
    @Query("SELECT count(doc) FROM Docente doc")
    public Integer countTotalDocente();
}
