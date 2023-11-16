package app.repos;

import app.model.entities.Regimenhotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimenRepo extends JpaRepository<Regimenhotel,Integer> {
    
}
