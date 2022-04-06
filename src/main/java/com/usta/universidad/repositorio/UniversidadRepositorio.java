package com.usta.universidad.repositorio;

import com.usta.universidad.model.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UniversidadRepositorio extends JpaRepository<Universidad,Long> {
    @Query("SELECT count(uni) FROM Universidad uni")
    public Integer countTotalUniversidad();
}
