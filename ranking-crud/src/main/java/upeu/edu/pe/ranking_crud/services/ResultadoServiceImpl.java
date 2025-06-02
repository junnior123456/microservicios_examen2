package upeu.edu.pe.ranking_crud.services;


import org.springframework.stereotype.Service;
import upeu.edu.pe.ranking_crud.entities.Resultado;
import upeu.edu.pe.ranking_crud.repositories.ResultadoRepository;
import upeu.edu.pe.ranking_crud.services.ResultadoService;

import java.util.List;

@Service
public class ResultadoServiceImpl implements ResultadoService {

    private final ResultadoRepository resultadoRepository;

    public ResultadoServiceImpl(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    @Override
    public List<Resultado> getAllResultados() {
        return resultadoRepository.findAll();
    }

    @Override
    public Resultado saveResultado(Resultado resultado) {
        return resultadoRepository.save(resultado);
    }

    @Override
    public List<Resultado> list() {
        return resultadoRepository.findAll();
    }

    @Override
    public Resultado update(Resultado resultado) {
        return resultadoRepository.save(resultado);

    }

    @Override
    public void delete(Long id) {
        resultadoRepository.deleteById(id);
    }
}
