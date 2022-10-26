package SpringBoot.SpringBootV2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Long pais_id;
}
