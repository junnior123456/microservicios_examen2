package upeu.edu.pe.ranking_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.ranking_crud.entities.Equipo;

import java.util.Optional;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    Optional<Equipo> findByNombre(String nombre);
}
