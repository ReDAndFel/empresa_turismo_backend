package app.repos;

import app.model.entities.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilRepo extends JpaRepository<Automovil,Integer> {
    
}
