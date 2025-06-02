package upeu.edu.pe.ranking_crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.ranking_crud.entities.Area;
import upeu.edu.pe.ranking_crud.services.AreaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping
    public ResponseEntity<Area> create(@RequestBody Area area) {
        Area created = areaService.create(area);
        return ResponseEntity.created(URI.create("/api/areas/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<Area>> getAll() {
        return ResponseEntity.ok(areaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> getById(@PathVariable Long id) {
        return ResponseEntity.ok(areaService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Area> update(@PathVariable Long id, @RequestBody Area area) {
        return ResponseEntity.ok(areaService.update(id, area));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        areaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
