package app.repos;

import app.model.entities.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciaRepo extends JpaRepository<Agencia,Integer> {
    
}
