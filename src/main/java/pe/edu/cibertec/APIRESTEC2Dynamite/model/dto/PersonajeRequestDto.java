package pe.edu.cibertec.APIRESTEC2Dynamite.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PersonajeRequestDto {
    private String NomPersonaje;
    private String ApePersonaje;
    private List<ProgramaTVRequestDto> programas = new ArrayList<>();
}
