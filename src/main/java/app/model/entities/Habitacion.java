package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HABITACION")
public class Habitacion {
    @Id
    @Column(name = "IDHABITACION", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHOTEL", nullable = false)
    private Hotel idhotel;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDNIVEL", nullable = false)
    private Nivelhabitacion idnivel;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    private Long cantidad;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "PRECIONOCHE", nullable = false)
    private Double precionoche;

}