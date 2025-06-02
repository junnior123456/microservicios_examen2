package upeu.edu.pe.ranking_crud.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Ranking Caleb 2025 - API",
                version = "1.0.0",
                description = "CRUD completo de equipos, áreas, resultados y detalles"
        )
)
public class OpenApiConfig {
}
