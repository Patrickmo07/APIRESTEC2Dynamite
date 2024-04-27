package pe.edu.cibertec.APIRESTEC2Dynamite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.ProgramaTV;
import pe.edu.cibertec.APIRESTEC2Dynamite.repository.ProgramaTVRepository;

@AllArgsConstructor
@Service
public class ProgramaTVService implements IProgramaTVService {
    private ProgramaTVRepository programaTVRepository;

    @Override
    public ProgramaTV registrarProgramaTV(ProgramaTV programaTV) {
        return programaTVRepository.save(programaTV);
    }
}
