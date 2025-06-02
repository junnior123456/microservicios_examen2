package upeu.edu.pe.report_ms.services;

import org.springframework.stereotype.Service;
import upeu.edu.pe.report_ms.helpers.ReportHelper;
import upeu.edu.pe.report_ms.models.Resultado;
import upeu.edu.pe.report_ms.repositories.RankingRepository;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private final RankingRepository rankingRepository;
    private final ReportHelper reportHelper;

    public ReportServiceImpl(RankingRepository rankingRepository, ReportHelper reportHelper) {
        this.rankingRepository = rankingRepository;
        this.reportHelper = reportHelper;
    }

    @Override
    public List<Resultado> getAllResultados() {
        return rankingRepository.getAllResultados();
    }

    @Override
    public String makeReport(Resultado resultado) {
        return reportHelper.leerPlantilla(resultado);
    }
}
