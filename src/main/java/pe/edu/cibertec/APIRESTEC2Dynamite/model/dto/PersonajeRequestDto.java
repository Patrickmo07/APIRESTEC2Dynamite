package pe.edu.cibertec.APIRESTEC2Dynamite.model.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
public class PersonajeRequestDto {
    private String NomPersonaje;
    private String ApePersonaje;
    private Date FechNacPersonaje;
    private List<ProgramaTVRequestDto> programas = new ArrayList<>();
}
