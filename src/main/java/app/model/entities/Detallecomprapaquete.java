package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DETALLECOMPRAPAQUETE")
public class Detallecomprapaquete {
    @Id
    @Column(name = "IDDETALLECOMPRA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCOMPRA", nullable = false)
    private Comprapaquete idcompra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDPAQUETE", nullable = false)
    private Paqueteturistico idpaquete;

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