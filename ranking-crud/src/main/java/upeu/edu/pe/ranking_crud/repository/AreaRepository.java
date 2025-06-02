package upeu.edu.pe.ranking_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.ranking_crud.entities.Area;

import java.util.Optional;

public interface AreaRepository extends JpaRepository<Area, Long> {
    Optional<Area> findByNombre(String nombre);
}
