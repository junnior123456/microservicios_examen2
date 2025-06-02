package upeu.edu.pe.report_ms.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import upeu.edu.pe.report_ms.models.Resultado;

import java.util.List;

@FeignClient(name = "ranking-crud")
public interface RankingRepository {

    @GetMapping("/ranking-crud/api/resultados")
    List<Resultado> getAllResultados();
}
