package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "COMPRAPAQUETE")
public class Comprapaquete {
    @Id
    @Column(name = "IDCOMPRA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCLIENTE", nullable = false)
    private Cliente idcliente;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDAGENCIA", nullable = false)
    private Agencia idagencia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDESTADOCOMPRA", nullable = false)
    private Estadocomprapaquete idestadocompra;

    @NotNull
    @Column(name = "VALORTOTAL", nullable = false)
    private Double valortotal;

    @NotNull
    @Column(name = "FECHACOMPRA", nullable = false)
    private LocalDate fechacompra;

    @NotNull
    @Column(name = "FECHAREQUERIDA", nullable = false)
    private LocalDate fecharequerida;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

}