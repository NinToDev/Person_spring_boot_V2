package SpringBoot.SpringBootV2.service;

import SpringBoot.SpringBootV2.model.Persona;
import SpringBoot.SpringBootV2.Interface.IPersonaService;
import SpringBoot.SpringBootV2.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> list() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public Persona create(Persona oPersona) {
        Persona persona = personaRepository.save(oPersona);
        return persona;
    }
}

