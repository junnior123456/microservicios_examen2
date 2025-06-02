package upeu.edu.pe.ranking_crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.ranking_crud.entities.Resultado;
import upeu.edu.pe.ranking_crud.services.ResultadoService;

import java.util.List;

@RestController
@RequestMapping("/api/resultados")
public class ResultadoController {

    private final ResultadoService resultadoService;

    public ResultadoController(ResultadoService resultadoService) {
        this.resultadoService = resultadoService;
    }

    @GetMapping
    public List<Resultado> getAllResultados() {
        return resultadoService.getAllResultados();
    }

    @PostMapping
    public Resultado saveResultado(@RequestBody Resultado resultado) {
        return resultadoService.saveResultado(resultado);
    }
    @PutMapping
    public ResponseEntity<Resultado> actualizar(@RequestBody Resultado resultado) {
        return ResponseEntity.ok(resultadoService.update(resultado));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        resultadoService.delete(id);
        return ResponseEntity.ok().build();
    }


}
