package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HOTEL")
public class Hotel {
    @Id
    @Column(name = "IDHOTEL", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDTIPO", nullable = false)
    private Tipohotel idtipo;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @Size(max = 40)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;

}