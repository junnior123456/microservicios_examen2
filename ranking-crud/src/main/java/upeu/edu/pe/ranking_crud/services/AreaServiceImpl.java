package upeu.edu.pe.ranking_crud.services;

import org.springframework.stereotype.Service;
import upeu.edu.pe.ranking_crud.entities.Area;
import upeu.edu.pe.ranking_crud.repository.AreaRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AreaServiceImpl implements AreaService {

    private final AreaRepository areaRepository;

    public AreaServiceImpl(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @Override
    public Area create(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Area getById(Long id) {
        return areaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Área no encontrada"));
    }

    @Override
    public List<Area> getAll() {
        return areaRepository.findAll();
    }

    @Override
    public Area update(Long id, Area area) {
        Area existente = getById(id);
        existente.setNombre(area.getNombre());
        existente.setEtapa(area.getEtapa());
        return areaRepository.save(existente);
    }

    @Override
    public void delete(Long id) {
        areaRepository.deleteById(id);
    }
}
