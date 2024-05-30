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
    private Date fechaNacimientoPersona;
    private String ocupacion;
    private String estadoCivil;

    public String getNombrePersona() {
        return nombrePersona;
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public String getSexoPersona() {
        return sexoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public Date getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
