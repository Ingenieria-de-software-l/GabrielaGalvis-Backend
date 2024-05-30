package com.generador.generadorrrrHDV.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LaboralDto {

    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String nombreJefe;
    private Date fechaInicio;
    private Date fechaFin;
    private String cargo;
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getCargo() {
        return cargo;
    }


}
