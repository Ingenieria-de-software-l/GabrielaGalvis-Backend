package com.generador.generadorrrrHDV.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "estudio")
public class EstudioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;  

    @Column(name = "nombreInstituto")
    private String nombre;

    @Column(name="lugarGrado")
    private String lugarGrado;

    @Column(name = "anio")
    private Date anio;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Long getId() {
        return id;
    }

    public EstudioEntity(String nombre, String lugarGrado, Date anio) {
        this.nombre = nombre;
        this.lugarGrado = lugarGrado;
        this.anio = anio;
    }
    
    

}

