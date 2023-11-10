package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ARTICULO")
public class Articulo {
    @Id
    @Column(name = "IDARTICULO", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDTIPO", nullable = false)
    private Tipoarticulo idtipo;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @Size(max = 40)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

}