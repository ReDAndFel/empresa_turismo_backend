package app.repos;

import app.model.entities.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepo extends JpaRepository<Articulo,Integer> {
    
}
