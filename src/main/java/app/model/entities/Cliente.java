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
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @Column(name = "IDCLIENTE", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "TELEFONO", nullable = false)
    private Long telefono;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @Size(max = 40)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;

    @Size(max = 40)
    @NotNull
    @Column(name = "APELLIDO", nullable = false, length = 40)
    private String apellido;

    @Size(max = 40)
    @NotNull
    @Column(name = "CORREO", nullable = false, length = 40)
    private String correo;

}