package com.usta.universidad.rest;

import com.usta.universidad.model.Seccional;
import com.usta.universidad.servicios.SeccionalServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seccional/")
public class SeccionalRest {
    @Autowired // Le dice al programa que existe una entidad, un repo y un servicio
    private SeccionalServicios seccionalServicios;

    @GetMapping("Listar")//ruta personalizada
    private ResponseEntity<List<Seccional>> listarTodasSeccionales() {
        return ResponseEntity.ok(seccionalServicios.getAllSeccional());
    }

    @PostMapping("Crear")
    private ResponseEntity<Seccional> guardarSeccional(@RequestBody Seccional seccional) {
        Seccional temporal = seccionalServicios.crearSeccional(seccional);
        try {
            return ResponseEntity.created(new URI("/api/seccional/" + temporal.getIdSeccional())).body(seccional);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "Listar/{id}")
    private ResponseEntity<Optional<Seccional>> listarSeccionalById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(seccionalServicios.findById(id));
    }
}
