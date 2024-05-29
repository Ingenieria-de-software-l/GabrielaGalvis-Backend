package com.generador.generadorrrrHDV.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferenciaEntity {
    @Id
    @Column(name = "nombreRef")
    private String nombreRef;

    @Column(name = "ocupacionRef")
    private String ocupacionRef;

    @Column(name = "parentesco")
    private String parentesco;

    @Column(name ="telefono")
    private String telefono;
}
