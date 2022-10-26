package SpringBoot.SpringBootV2.repository;

import SpringBoot.SpringBootV2.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
