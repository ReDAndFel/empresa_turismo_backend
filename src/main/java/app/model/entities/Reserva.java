package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "RESERVA")
public class Reserva {
    @Id
    @Column(name = "IDRESERVA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCLIENTE", nullable = false)
    private Cliente idcliente;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDREGIMEN", nullable = false)
    private Regiman idregimen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDAGENCIA", nullable = false)
    private Agencia idagencia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDESTADORESERVA", nullable = false)
    private Estadoreserva idestadoreserva;

    @NotNull
    @Column(name = "FECHAINICIO", nullable = false)
    private LocalDate fechainicio;

    @NotNull
    @Column(name = "FECHAFINAL", nullable = false)
    private LocalDate fechafinal;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "VALORTOTAL", nullable = false)
    private Double valortotal;

}