package upeu.edu.pe.ranking_crud.services;

import upeu.edu.pe.ranking_crud.entities.Equipo;

import java.util.List;

public interface EquipoService {
    Equipo create(Equipo equipo);
    Equipo getById(Long id);
    List<Equipo> getAll();
    Equipo update(Long id, Equipo equipo);
    void delete(Long id);
}
