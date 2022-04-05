package com.usta.universidad.servicios;

import com.usta.universidad.model.Seccional;
import com.usta.universidad.repositorio.SeccionalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeccionalServicios {
    @Autowired
    private SeccionalRepositorio seccionalRepositorio;

    public List<Seccional> getAllSeccional() {

        return seccionalRepositorio.findAll();
    }

    public Seccional crearSeccional(Seccional seccional)
    {
        return seccionalRepositorio.save(seccional);
    }

    public Optional<Seccional> findById(Long id) {
        return seccionalRepositorio.findById(id);
    }

}
