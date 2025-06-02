package upeu.edu.pe.ranking_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.ranking_crud.entities.Resultado;

public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
}
