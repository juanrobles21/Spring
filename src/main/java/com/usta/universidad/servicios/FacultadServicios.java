package com.usta.universidad.servicios;

import com.usta.universidad.model.Facultad;
import com.usta.universidad.repositorio.FacultadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadServicios {
    @Autowired
    private FacultadRepositorio facultadRepositorio;


    public List<Facultad> getAllFacultades() {

        return facultadRepositorio.findAll();
    }

    public Facultad crearFacultad(Facultad facultad) {
        return facultadRepositorio.save(facultad);
    }

    public Optional<Facultad> findById(Long id) {
        return facultadRepositorio.findById(id);
    }

    public void deleteById(Long id) {
        facultadRepositorio.deleteById(id);
    }
    //Metodos especificos
    public Integer countTotalFacultades(){
        return facultadRepositorio.countTotalFacultades();
    }




}
