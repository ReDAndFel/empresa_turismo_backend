package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DETALLERESERVAHABITACION")
public class Detallereservahabitacion {
    @Id
    @Column(name = "IDDETALLERESERVA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDRESERVA", nullable = false)
    private Reserva idreserva;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHABITACION", nullable = false)
    private Habitacion idhabitacion;

    @NotNull
    @Column(name = "UNIDADES", nullable = false)
    private Long unidades;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @NotNull
    @Column(name = "DESCUENTO", nullable = false)
    private Double descuento;

}