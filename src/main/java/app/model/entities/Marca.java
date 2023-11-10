package app.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MARCA")
public class Marca {
    @Id
    @Column(name = "IDMARCA", nullable = false)
    private Long id;

    @Size(max = 40)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 40)
    private String descripcion;

}