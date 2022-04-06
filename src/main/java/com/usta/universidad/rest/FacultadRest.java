package com.usta.universidad.rest;

import com.usta.universidad.model.Facultad;
import com.usta.universidad.servicios.FacultadServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultad/")
public class FacultadRest {
    @Autowired // Le dice al programa que existe una entidad, un repo y un servicio
    private FacultadServicios facultadServicios;

    @GetMapping("Listar")//ruta personalizada
    private ResponseEntity<List<Facultad>> listarTodasFacultades() {
        return ResponseEntity.ok(facultadServicios.getAllFacultades());
    }

    @PostMapping("Crear")
    private ResponseEntity<Facultad> guardarFacultades(@RequestBody Facultad facultad) {
        Facultad temporal = facultadServicios.crearFacultad(facultad);
        try {
            return ResponseEntity.created(new URI("/api/facultades/" + temporal.getCodFacultad())).body(facultad);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "Listar/{id}")
    private ResponseEntity<Optional<Facultad>> listarFacultadesById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(facultadServicios.findById(id));
    }

    @DeleteMapping("delete/{id}")
    private ResponseEntity<Void> eliminarFacultad(@PathVariable("id") Long id) {
        facultadServicios.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("Editar")
    private ResponseEntity<Facultad> editarFacultades(@RequestBody Facultad facultad) {
        Facultad temporal = facultadServicios.crearFacultad(facultad);
        try {
            return ResponseEntity.created(new URI("/api/facultades/" + temporal.getCodFacultad())).body(facultad);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping(value = "Contar")
    private ResponseEntity<Integer> contarFacultades(){
        return  ResponseEntity.ok(facultadServicios.countTotalFacultades());
    }


}
