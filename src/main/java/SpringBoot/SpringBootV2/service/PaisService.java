package SpringBoot.SpringBootV2.service;

import SpringBoot.SpringBootV2.Interface.IPaisService;
import SpringBoot.SpringBootV2.model.Pais;
import SpringBoot.SpringBootV2.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService implements IPaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll();
    }
}
