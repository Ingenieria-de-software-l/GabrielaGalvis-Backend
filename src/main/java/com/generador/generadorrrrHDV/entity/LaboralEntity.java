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
import java.util.Date;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "laboral")
public class LaboralEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name="nombreEmpresa")
    private String nombreEmpresa;

    @Column(name = "direccionEmpresa")
    private String direccionEmpresa;

    @Column(name = "telefonoEmpresa")
    private String telefonoEmpresa;

    @Column(name = "nombreJefe")
    private String nombreJefe;

    @Column(name = "fechaInicio")
    private Date fechaInicio;

    @Column(name = "fechaFin")
    private Date fechaFin;

    @Column(name ="cargo")
    private String cargo;


    public LaboralEntity(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nombreJefe, Date fechaInicio, Date fechaFin, String cargo) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nombreJefe = nombreJefe;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cargo = cargo;
    }
}
