package pe.edu.cibertec.APIRESTEC2Dynamite.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "programatv")
public class ProgramaTV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdProgramaTv;
    private String Titulo;
    private String Resumen;
    private Date FechaInicio;
    @ManyToOne
    @JoinColumn(name = "IdPersonaje")
    private Personaje personaje;

}
