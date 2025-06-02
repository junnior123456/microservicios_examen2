package upeu.edu.pe.report_ms.services;

import upeu.edu.pe.report_ms.models.Resultado;

import java.util.List;

public interface ReportService {
    List<Resultado> getAllResultados();
    String makeReport(Resultado resultado);
}
