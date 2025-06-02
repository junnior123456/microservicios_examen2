package upeu.edu.pe.ranking_crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.ranking_crud.entities.Equipo;
import upeu.edu.pe.ranking_crud.services.EquipoService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    private final EquipoService equipoService;

    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @PostMapping
    public ResponseEntity<Equipo> create(@RequestBody Equipo equipo) {
        Equipo created = equipoService.create(equipo);
        return ResponseEntity.created(URI.create("/api/equipos/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<Equipo>> getAll() {
        return ResponseEntity.ok(equipoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipo> getById(@PathVariable Long id) {
        return ResponseEntity.ok(equipoService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipo> update(@PathVariable Long id, @RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.update(id, equipo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        equipoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
