package upeu.edu.pe.ranking_crud.services;

import upeu.edu.pe.ranking_crud.entities.Resultado;

import java.util.List;

public interface ResultadoService {
    List<Resultado> getAllResultados();
    Resultado saveResultado(Resultado resultado);
    List<Resultado> list();
    Resultado update(Resultado resultado);
    void delete(Long id);



}
