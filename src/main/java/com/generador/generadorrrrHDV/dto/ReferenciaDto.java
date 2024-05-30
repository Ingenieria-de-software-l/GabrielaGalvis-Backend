package com.generador.generadorrrrHDV.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReferenciaDto {

    private String nombreRef;
    private String ocupacionRef;
    private String parentesco;
    private String telefono;

    public String getNombreRef() {
        return nombreRef;
    }

    public String getOcupacionRef() {
        return ocupacionRef;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getTelefono() {
        return telefono;
    }
   

}
