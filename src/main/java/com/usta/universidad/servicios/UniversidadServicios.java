package com.usta.universidad.servicios;

import com.usta.universidad.model.Universidad;
import com.usta.universidad.repositorio.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversidadServicios {
    @Autowired
    private UniversidadRepositorio universidadRepositorio;

    public List<Universidad> getAllUniversiad(){
        return universidadRepositorio.findAll();
    }
    public Universidad crearUniversiad(Universidad universidad){
        return universidadRepositorio.save(universidad);
    }
    public Optional<Universidad> findByID(Long id){
        return universidadRepositorio.findById(id);
    }
}
