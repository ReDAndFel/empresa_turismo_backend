package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AUTOMOVIL")
public class Automovil {
    @Id
    @Column(name = "IDAUTOMOVIL", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDGAMA", nullable = false)
    private Gama idgama;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDTIPO", nullable = false)
    private Tipoauto idtipo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDMARCA", nullable = false)
    private Marca idmarca;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @Size(max = 6)
    @NotNull
    @Column(name = "PLACA", nullable = false, length = 6)
    private String placa;

    @NotNull
    @Column(name = "PRECIO", nullable = false)
    private Double precio;

}