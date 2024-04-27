package pe.edu.cibertec.APIRESTEC2Dynamite.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.Personaje;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.ProgramaTV;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.dto.PersonajeRequestDto;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.dto.ProgramaTVRequestDto;
import pe.edu.cibertec.APIRESTEC2Dynamite.repository.PersonajeRepository;

@Service
@AllArgsConstructor
public class PersonajeService implements IPersonajeService {
    private PersonajeRepository personajeRepository;
    private IProgramaTVService iProgramaTVService;

    @Transactional
    @Override
    public Personaje registrarPersonaje(PersonajeRequestDto personajeRequestDto) {
        Personaje personaje = new Personaje();
        personaje.setNomPersonaje (personajeRequestDto.getNomPersonaje());
        personaje.setApePersonaje(personajeRequestDto.getApePersonaje());
        personaje.setFechNacPersonaje(personajeRequestDto.getFechNacPersonaje());
        Personaje nuevoPersonaje = personajeRepository.save(personaje);
        ProgramaTV programaTV;
        for (ProgramaTVRequestDto programaTVRequestDto : personajeRequestDto.getProgramas()){
            programaTV = new ProgramaTV();
            programaTV.setTitulo(programaTVRequestDto.getTitulo());
            programaTV.setResumen(programaTVRequestDto.getResumen());
            programaTV.setFechaInicio(programaTVRequestDto.getFechaInicio());
            programaTV.setPersonaje(nuevoPersonaje);
            iProgramaTVService.registrarProgramaTV(programaTV);
        };

        return nuevoPersonaje;
    }
}

