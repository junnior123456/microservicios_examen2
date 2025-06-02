package upeu.edu.pe.ranking_crud.services;

import org.springframework.stereotype.Service;
import upeu.edu.pe.ranking_crud.entities.Detalle;
import upeu.edu.pe.ranking_crud.repository.DetalleRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DetalleServiceImpl implements DetalleService {

    private final DetalleRepository detalleRepository;

    public DetalleServiceImpl(DetalleRepository detalleRepository) {
        this.detalleRepository = detalleRepository;
    }

    @Override
    public Detalle create(Detalle detalle) {
        return detalleRepository.save(detalle);
    }

    @Override
    public Detalle getById(Long id) {
        return detalleRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Detalle no encontrado"));
    }

    @Override
    public List<Detalle> getAll() {
        return detalleRepository.findAll();
    }

    @Override
    public Detalle update(Long id, Detalle detalle) {
        Detalle existente = getById(id);
        existente.setDescripcion(detalle.getDescripcion());
        existente.setEvidencia(detalle.getEvidencia());
        existente.setResultado(detalle.getResultado());
        return detalleRepository.save(existente);
    }

    @Override
    public void delete(Long id) {
        detalleRepository.deleteById(id);
    }
}
