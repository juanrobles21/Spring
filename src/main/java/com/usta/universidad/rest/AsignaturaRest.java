package com.usta.universidad.rest;

import com.usta.universidad.model.Asignaturas;
import com.usta.universidad.servicios.AsignaturasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignatura/")
public class AsignaturaRest {
    @Autowired // Le dice al programa que existe una entidad, un repo y un servicio
    private AsignaturasServicios asignaturasServicios;

    @GetMapping("Listar")//ruta personalizada
    private ResponseEntity<List<Asignaturas>> listarTodasAsignaturas() {
        return ResponseEntity.ok(asignaturasServicios.getAllAsignaturas());
    }

    @PostMapping("Crear")
    private ResponseEntity<Asignaturas> guardarAsignaturas(@RequestBody Asignaturas asignaturas) {
        Asignaturas temporal = asignaturasServicios.crearAsignatura(asignaturas);
        try {
            return ResponseEntity.created(new URI("/api/asignatura/" + temporal.getIdAsignatura())).body(asignaturas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "Listar/{id}")
    private ResponseEntity<Optional<Asignaturas>> listarAsignaturaById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(asignaturasServicios.findById(id));
    }

}
