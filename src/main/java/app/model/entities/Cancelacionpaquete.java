package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "CANCELACIONPAQUETE")
public class Cancelacionpaquete {
    @Id
    @Column(name = "IDCOMPRAPAQUETE", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDCOMPRAPAQUETE", nullable = false)
    private Comprapaquete comprapaquete;

    @NotNull
    @Column(name = "FECHA", nullable = false)
    private LocalDate fecha;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "COSTO", nullable = false)
    private Double costo;

    @Size(max = 150)
    @NotNull
    @Column(name = "MOTIVO", nullable = false, length = 150)
    private String motivo;

}