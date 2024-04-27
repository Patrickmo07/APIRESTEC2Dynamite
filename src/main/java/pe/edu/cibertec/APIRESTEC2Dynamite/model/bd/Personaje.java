package pe.edu.cibertec.APIRESTEC2Dynamite.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "personaje")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPersonaje;
    private String NomPersonaje;
    private String ApePersonaje;
    private Date FechNacPersonaje;


}
