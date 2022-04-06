package com.usta.universidad.repositorio;

import com.usta.universidad.model.Seccional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeccionalRepositorio extends JpaRepository<Seccional,Long> {
    @Query("SELECT count(sec) FROM Seccional sec")
    public Integer countTotalSeccional();
}
