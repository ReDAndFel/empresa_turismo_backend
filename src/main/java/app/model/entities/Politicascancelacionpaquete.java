package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "POLITICASCANCELACIONPAQUETE")
public class Politicascancelacionpaquete {
    @Id
    @Column(name = "IDPOLITICA", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDPAQUETE", nullable = false)
    private Paqueteturistico idpaquete;

    @NotNull
    @Column(name = "DIASDIFERENCIAMAX", nullable = false)
    private Long diasdiferenciamax;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

    @NotNull
    @Column(name = "COSTOPORNOCHE", nullable = false)
    private Double costopornoche;

    @NotNull
    @Column(name = "COSTOPORPERSONA", nullable = false)
    private Double costoporpersona;

}