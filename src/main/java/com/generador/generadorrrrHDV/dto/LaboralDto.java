package com.generador.generadorrrrHDV.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LaboralDto {

    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String nombreJefe;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String cargo;
}
