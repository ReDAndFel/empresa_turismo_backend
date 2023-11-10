package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DESCRIPCIONHABITACION")
public class Descripcionhabitacion {
    @Id
    @Column(name = "IDHABITACION", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHABITACION", nullable = false)
    private Habitacion habitacion;

    @Size(max = 100)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;

}