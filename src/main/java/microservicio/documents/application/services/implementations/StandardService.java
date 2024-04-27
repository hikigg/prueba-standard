package microservicio.documents.application.services.implementations;

import microservicio.documents.application.repositories.StandardRepository;
import microservicio.documents.application.services.interfaces.IStandardService;
import microservicio.documents.domain.dtos.StandardDTO;
import microservicio.documents.domain.entities.StandardE;
import microservicio.documents.domain.entities.Status;
import microservicio.documents.infraestructure.utils.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StandardService implements IStandardService  {

    private final StandardRepository standardRepository;

    public StandardService(StandardRepository standardRepository) {
        this.standardRepository = standardRepository;
    }

    private StandardE findByStandardId(String id) throws Exception {
        return standardRepository.findById(id).orElseThrow();
    }


    @Override
    public List<StandardE> findAll() {
        return standardRepository.findAll();
    }

    @Override
    public StandardE findById(String id) throws Exception {
        return findByStandardId(id);
    }

    @Override
    public StandardE save(StandardDTO standardDTO) {
        StandardE standard = ModelMapperUtils.map(standardDTO, StandardE.class);
        standard.setCreateAt(LocalDateTime.now());
        standard.setUpdateAt(LocalDateTime.now());
        standard.setState(Status.Activo);
        return standardRepository.save(standard);
    }

    @Override
    public void update(String id, StandardDTO standardDTO) throws Exception {
        StandardE standard = findByStandardId(id);
        ModelMapperUtils.mapVoid(standardDTO, standard);
        standard.setUpdateAt(LocalDateTime.now());
        standardRepository.save(standard);

    }

    @Override
    public void delete(String id) throws Exception {

        StandardE standard = findByStandardId(id);
        standard.setState(Status.Inactivo);
        standard.setUpdateAt(LocalDateTime.now());
        standardRepository.save(standard);
    }

    @Override
    public void activate(String id) throws Exception {
        StandardE standard = findByStandardId(id);
        standard.setState(Status.Activo);
        standard.setUpdateAt(LocalDateTime.now());
        standardRepository.save(standard);
    }
}
