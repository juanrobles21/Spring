package com.usta.universidad.servicios;

import com.usta.universidad.model.Docente;
import com.usta.universidad.repositorio.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServicios {
    @Autowired
    private DocenteRepositorio docenteRepositorio;

    public List<Docente> getAllDocente() {

        return docenteRepositorio.findAll();
    }

    public Docente crearDocente(Docente docente) {
        return docenteRepositorio.save(docente);
    }

    public Optional<Docente> findById(Long id) {
        return docenteRepositorio.findById(id);
    }

}
