package com.usta.universidad.rest;

import com.usta.universidad.model.Universidad;
import com.usta.universidad.servicios.UniversidadServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appi/universidad/")
public class UniversidadRest {
    @Autowired
    private UniversidadServicios universidadServicios;

    @GetMapping("Listar")
    private ResponseEntity<List<Universidad>> listarUniversiad(){
        return ResponseEntity.ok(universidadServicios.getAllUniversiad());
    }
    @PostMapping("Crear")
    private ResponseEntity<Universidad> guardarFacultades(@RequestBody Universidad universidad) {
        Universidad temporal = universidadServicios.crearUniversiad(universidad);
        try {
            return ResponseEntity.created(new URI("/api/universidad/" + temporal.getIdUniversidad())).body(universidad);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping(value = "Listar/{id}")
    private ResponseEntity<Optional<Universidad>>listarFacultadesById(@PathVariable("id")Long id){
        return ResponseEntity.ok(universidadServicios.findByID(id));
    }
}
