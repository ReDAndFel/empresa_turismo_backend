package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DETALLERESERVAAUTO")
public class Detallereservaauto {
    @Id
    @Column(name = "IDDETALLERESERVA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDAUTOMOVIL", nullable = false)
    private Automovil idautomovil;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDRESERVA", nullable = false)
    private Reservaautomovil idreserva;

    @NotNull
    @Column(name = "SEGURO", nullable = false)
    private Boolean seguro = false;

    @NotNull
    @Column(name = "GPS", nullable = false)
    private Boolean gps = false;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

}