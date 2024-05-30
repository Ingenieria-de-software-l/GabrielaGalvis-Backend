package com.generador.generadorrrrHDV.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EstudioEntity {

    @Id
    @Column(name = "nombreInstituto")
    private String nombre;

    @Column(name="lugarGrado")
    private String lugarGrado;

    @Column(name = "anio")
    private Date anio;
}
