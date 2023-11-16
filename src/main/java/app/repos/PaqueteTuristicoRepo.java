package app.repos;

import app.model.entities.Paqueteturistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaqueteTuristicoRepo extends JpaRepository<Paqueteturistico,Integer> {
    
}
