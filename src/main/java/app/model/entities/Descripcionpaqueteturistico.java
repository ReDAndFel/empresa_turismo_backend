package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DESCRIPCIONPAQUETETURISTICO")
public class Descripcionpaqueteturistico {
    @Id
    @Column(name = "IDPAQUETE", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDPAQUETE", nullable = false)
    private Paqueteturistico paqueteturistico;

    @Size(max = 100)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;

}