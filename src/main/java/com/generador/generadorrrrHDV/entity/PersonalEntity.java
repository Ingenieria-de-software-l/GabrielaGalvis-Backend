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
public class PersonalEntity {

    @Id
    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombrePersona")
    private String nombrePersona;

    @Column(name = "apellidoPersona")
    private String apellidoPersona;

    @Column(name = "generoPersona")
    private String sexoPersona;

    @Column(name = "correo")
    private String correoPersona;

    @Column(name = "telefono")
    private String telefonoPersona;

    @Column(name = "direccionPersona")
    private String direccionPersona;

    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimientoPersona;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "estadoCivil")
    private String estadoCivil;
}
