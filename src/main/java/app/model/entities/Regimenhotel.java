package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "REGIMENHOTEL")
public class Regimenhotel {
    @Id
    @Column(name = "IDREGIMENHOTEL", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDREGIMEN", nullable = false)
    private Regiman idregimen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHOTEL", nullable = false)
    private Hotel idhotel;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

}