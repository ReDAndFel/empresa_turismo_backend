package app;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
@Transactional
@AllArgsConstructor
public class DatabaseTestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testDatabaseConnection() {
        try {
            String sql = "SELECT COUNT(*) FROM CLIENTE";
            System.out.println("Query SQL: " + sql);
            int result = jdbcTemplate.queryForObject(sql, Integer.class);


            if (result > 0) {
                System.out.println("Número de usuarios: " + result);
            } else {
                System.out.println("No se encontraron usuarios.");
            }
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Error al ejecutar la consulta: No se encontraron resultados.");
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}
