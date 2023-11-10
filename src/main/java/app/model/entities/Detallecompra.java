package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DETALLECOMPRA")
public class Detallecompra {
    @Id
    @Column(name = "IDDETALLECOMPRA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCOMPRA", nullable = false)
    private Compraarticulo idcompra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDARTICULO", nullable = false)
    private Articulo idarticulo;

    @NotNull
    @Column(name = "UNIDADES", nullable = false)
    private Long unidades;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

}