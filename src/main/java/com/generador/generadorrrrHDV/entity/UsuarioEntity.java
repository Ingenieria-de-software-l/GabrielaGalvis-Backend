package com.generador.generadorrrrHDV.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import jakarta.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id", referencedColumnName = "id")
    private PersonalEntity personal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estudio_id", referencedColumnName = "id")
    private EstudioEntity estudio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "referencia_id", referencedColumnName = "id")
    private ReferenciaEntity referencia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laboral_id", referencedColumnName = "id")
    private LaboralEntity laboral;
}
