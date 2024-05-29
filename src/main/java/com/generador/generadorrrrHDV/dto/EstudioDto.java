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
public class EstudioDto {

    private String nombreInstituto;
    private String lugarGrado;
    private LocalDate anio;

}
