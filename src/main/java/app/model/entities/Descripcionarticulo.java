package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DESCRIPCIONARTICULO")
public class Descripcionarticulo {
    @Id
    @Column(name = "IDARTICULO", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDARTICULO", nullable = false)
    private Articulo articulo;

    @Size(max = 100)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;

}