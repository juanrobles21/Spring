package com.usta.universidad.rest;

import com.usta.universidad.model.Docente;
import com.usta.universidad.servicios.DocenteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/docente/")
public class DocenteRest {
    @Autowired // Le dice al programa que existe una entidad, un repo y un servicio
    private DocenteServicios docenteServicios;

    @GetMapping("Listar")//ruta personalizada
    private ResponseEntity<List<Docente>> listarTodosDocentes() {
        return ResponseEntity.ok(docenteServicios.getAllDocente());
    }

    @PostMapping("Crear")
    private ResponseEntity<Docente> guardarDocentes(@RequestBody Docente docente) {
        Docente temporal = docenteServicios.crearDocente(docente);
        try {
            return ResponseEntity.created(new URI("/api/docente/" + temporal.getCodDocente())).body(docente);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "Listar/{id}")
    private ResponseEntity<Optional<Docente>> listarDocenteById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(docenteServicios.findById(id));
    }
}
