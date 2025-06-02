package upeu.edu.pe.ranking_crud.services;

import upeu.edu.pe.ranking_crud.entities.Detalle;

import java.util.List;

public interface DetalleService {
    Detalle create(Detalle detalle);
    Detalle getById(Long id);
    List<Detalle> getAll();
    Detalle update(Long id, Detalle detalle);
    void delete(Long id);
}
