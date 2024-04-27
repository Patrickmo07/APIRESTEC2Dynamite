package pe.edu.cibertec.APIRESTEC2Dynamite.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ProgramaTVRequestDto {
    private String Titulo;
    private String Resumen;
    private Date FechaInicio;

}

