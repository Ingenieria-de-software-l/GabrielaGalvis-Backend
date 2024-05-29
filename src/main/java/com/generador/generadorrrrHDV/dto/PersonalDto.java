package com.generador.generadorrrrHDV.dto;

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
public class PersonalDto {

    private String identificacion;
    private String nombrePersona;
    private String apellidoPersona;
    private String sexoPersona;
    private String correoPersona;
    private String telefonoPersona;
    private String direccionPersona;
    private LocalDate fechaNacimientoPersona;
    private String ocupacion;
    private String estadoCivil;
}
