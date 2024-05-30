package com.generador.generadorrrrHDV.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "personal")
public class PersonalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
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
    private Date fechaNacimientoPersona;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "estadoCivil")
    private String estadoCivil;

 public PersonalEntity  (String identificacion, String nombrePersona, String apellidoPersona, String sexoPersona, String correoPersona, String telefonoPersona, String direccionPersona, Date fechaNacimientoPersona, String ocupacion, String estadoCivil) {
        this.identificacion = identificacion;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.sexoPersona = sexoPersona;
        this.correoPersona = correoPersona;
        this.telefonoPersona = telefonoPersona;
        this.direccionPersona = direccionPersona;
        this.fechaNacimientoPersona = fechaNacimientoPersona;
        this.ocupacion = ocupacion;
        this.estadoCivil = estadoCivil;
    }   

}
