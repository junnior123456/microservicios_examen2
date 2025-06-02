package upeu.edu.pe.report_ms.helpers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import upeu.edu.pe.report_ms.models.Resultado;

@Component
public class ReportHelper {

    @Value("${report.template}")
    private String reportTemplate;

    public String leerPlantilla(Resultado resultado) {
        return reportTemplate
                .replace("{puntaje}", String.valueOf(resultado.getPuntaje()))
                .replace("{equipo}", resultado.getEquipo().getNombre())
                .replace("{area}", resultado.getDetalle().getArea().getNombre())
                .replace("{descripcion}", resultado.getDescripcion());
    }
}
