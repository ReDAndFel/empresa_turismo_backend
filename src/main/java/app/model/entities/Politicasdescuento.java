package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "POLITICASDESCUENTO")
public class Politicasdescuento {
    @Id
    @Column(name = "IDPOLITICA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDPAQUETE", nullable = false)
    private Paqueteturistico idpaquete;

    @NotNull
    @Column(name = "PERSONASDESDE", nullable = false)
    private Long personasdesde;

    @NotNull
    @Column(name = "PERSONASHASTA", nullable = false)
    private Long personashasta;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "DESCUENTO", nullable = false)
    private Double descuento;

}