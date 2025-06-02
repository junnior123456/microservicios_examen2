package upeu.edu.pe.report_ms.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.report_ms.helpers.ReportHelper;
import upeu.edu.pe.report_ms.repositories.RankingRepository;
import upeu.edu.pe.report_ms.services.ReportService;
import upeu.edu.pe.report_ms.services.ReportServiceImpl;

@Configuration
public class ReportBeans {

    @Bean
    public ReportService reportService(RankingRepository rankingRepository, ReportHelper reportHelper) {
        return new ReportServiceImpl(rankingRepository, reportHelper);
    }
}
