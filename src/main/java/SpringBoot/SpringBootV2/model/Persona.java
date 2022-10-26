package SpringBoot.SpringBootV2.model;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private Long pais_id;
    private Long estado_id;
}
