package pe.edu.cibertec.APIRESTEC2Dynamite.service;

import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.Personaje;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.dto.PersonajeRequestDto;

public interface IPersonajeService {
    Personaje registrarPersonaje(PersonajeRequestDto personajeRequestDto);
}
