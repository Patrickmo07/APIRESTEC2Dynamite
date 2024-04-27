package pe.edu.cibertec.APIRESTEC2Dynamite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2Dynamite.model.bd.ProgramaTV;

@Repository
public interface ProgramaTVRepository extends JpaRepository<ProgramaTV,Integer> {

}
