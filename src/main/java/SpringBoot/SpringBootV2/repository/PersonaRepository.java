package SpringBoot.SpringBootV2.repository;

import SpringBoot.SpringBootV2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
