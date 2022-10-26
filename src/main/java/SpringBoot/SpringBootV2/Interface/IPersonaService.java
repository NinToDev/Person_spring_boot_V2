package SpringBoot.SpringBootV2.Interface;

import SpringBoot.SpringBootV2.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> list();
    public Optional<Persona> findById(Long id);
    public Persona create(Persona oPersona);
}
