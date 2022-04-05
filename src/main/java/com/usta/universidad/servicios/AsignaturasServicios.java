package com.usta.universidad.servicios;

import com.usta.universidad.model.Asignaturas;
import com.usta.universidad.repositorio.AsignaturasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturasServicios {
    @Autowired
    private AsignaturasRepositorio asignaturasRepositorio;

    public List<Asignaturas> getAllAsignaturas() {

        return asignaturasRepositorio.findAll();
    }

    public Asignaturas crearAsignatura(Asignaturas asignaturas) {
        return asignaturasRepositorio.save(asignaturas);
    }

    public Optional<Asignaturas> findById(Long id) {
        return asignaturasRepositorio.findById(id);
    }

}
