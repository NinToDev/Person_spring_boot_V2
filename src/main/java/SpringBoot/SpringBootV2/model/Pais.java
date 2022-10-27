package SpringBoot.SpringBootV2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nombre;
}
