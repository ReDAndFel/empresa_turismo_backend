package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "POLITICASCANCELACIONHOTEL")
public class Politicascancelacionhotel {
    @Id
    @Column(name = "IDPOLITICA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHOTEL", nullable = false)
    private Hotel idhotel;

    @NotNull
    @Column(name = "DIASDIFERENCIAMAX", nullable = false)
    private Long diasdiferenciamax;

    @NotNull
    @Column(name = "COSTO", nullable = false)
    private Double costo;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

}