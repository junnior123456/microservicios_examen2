package upeu.edu.pe.ranking_crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.ranking_crud.entities.Detalle;
import upeu.edu.pe.ranking_crud.services.DetalleService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleController {

    private final DetalleService detalleService;

    public DetalleController(DetalleService detalleService) {
        this.detalleService = detalleService;
    }

    @PostMapping
    public ResponseEntity<Detalle> create(@RequestBody Detalle detalle) {
        Detalle created = detalleService.create(detalle);
        return ResponseEntity.created(URI.create("/api/detalles/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<Detalle>> getAll() {
        return ResponseEntity.ok(detalleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Detalle> getById(@PathVariable Long id) {
        return ResponseEntity.ok(detalleService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Detalle> update(@PathVariable Long id, @RequestBody Detalle detalle) {
        return ResponseEntity.ok(detalleService.update(id, detalle));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        detalleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
