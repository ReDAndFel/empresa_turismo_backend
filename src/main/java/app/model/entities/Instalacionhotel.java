package app.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INSTALACIONHOTEL")
public class Instalacionhotel {
    @Id
    @Column(name = "IDINSTALACIONHOTEL", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDHOTEL", nullable = false)
    private Hotel idhotel;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDINSTALACION", nullable = false)
    private Instalacion idinstalacion;

    @NotNull
    @Column(name = "ESTADO", nullable = false)
    private Boolean estado = false;

}