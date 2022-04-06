package com.usta.universidad.repositorio;

import com.usta.universidad.model.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacultadRepositorio extends JpaRepository<Facultad, Long> {
    @Query("SELECT count(fac) FROM Facultad fac")
    public Integer countTotalFacultades();
}
