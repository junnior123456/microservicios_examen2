package upeu.edu.pe.ranking_crud.services;

import org.springframework.stereotype.Service;
import upeu.edu.pe.ranking_crud.entities.Equipo;
import upeu.edu.pe.ranking_crud.repository.EquipoRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EquipoServiceImpl implements EquipoService {

    private final EquipoRepository equipoRepository;

    public EquipoServiceImpl(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @Override
    public Equipo create(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public Equipo getById(Long id) {
        return equipoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Equipo no encontrado"));
    }

    @Override
    public List<Equipo> getAll() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo update(Long id, Equipo equipo) {
        Equipo existente = getById(id);
        existente.setNombre(equipo.getNombre());
        existente.setResponsable(equipo.getResponsable());
        return equipoRepository.save(existente);
    }

    @Override
    public void delete(Long id) {
        equipoRepository.deleteById(id);
    }
}
