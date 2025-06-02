package upeu.edu.pe.report_ms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.report_ms.models.Resultado;
import upeu.edu.pe.report_ms.services.ReportService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/reportes")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/resultados")
    public List<Resultado> getAllResultados() {
        return reportService.getAllResultados();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> postReport(@RequestBody Resultado resultado) {
        String mensaje = reportService.makeReport(resultado);
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", mensaje);
        return ResponseEntity.ok(response);
    }
}
