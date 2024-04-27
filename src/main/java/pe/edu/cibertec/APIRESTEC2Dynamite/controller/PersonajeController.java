package pe.edu.cibertec.APIRESTEC2Dynamite.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.Personaje;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.ProgramaTV;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.dto.PersonajeRequestDto;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.dto.ProgramaTVRequestDto;
import pe.edu.cibertec.APIRESTEC2Dynamite.service.IPersonajeService;
import pe.edu.cibertec.APIRESTEC2Dynamite.service.IProgramaTVService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/personaje")
public class PersonajeController {
    private IPersonajeService iPersonajeService;
    @PostMapping("")
    public ResponseEntity<Personaje> registrarPersonaje(
            @RequestBody PersonajeRequestDto personajeRequestDto
            ){
        return new ResponseEntity<>(
                iPersonajeService.registrarPersonaje(personajeRequestDto),
                HttpStatus.CREATED
        );
    }
}
