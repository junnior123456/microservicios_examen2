package upeu.edu.pe.ranking_crud.services;

import upeu.edu.pe.ranking_crud.entities.Area;

import java.util.List;

public interface AreaService {
    Area create(Area area);
    Area getById(Long id);
    List<Area> getAll();
    Area update(Long id, Area area);
    void delete(Long id);
}
