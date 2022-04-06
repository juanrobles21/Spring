package com.usta.universidad.repositorio;

import com.usta.universidad.model.Asignaturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AsignaturasRepositorio extends JpaRepository<Asignaturas,Long> {
    @Query("SELECT count(asg) FROM Asignaturas asg")
    public Integer countTotalAsignaturas();
}
