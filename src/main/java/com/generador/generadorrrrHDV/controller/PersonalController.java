package com.generador.generadorrrrHDV.controller;


import com.generador.generadorrrrHDV.dto.Mensaje;
import com.generador.generadorrrrHDV.dto.PersonalDto;
import com.generador.generadorrrrHDV.entity.PersonalEntity;
import com.generador.generadorrrrHDV.services.PersonalService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal")
@CrossOrigin(origins="http://localhost:4200")
public class PersonalController {

    @Autowired
    PersonalService personalService;

    @GetMapping("/listaPersonal")
    public ResponseEntity<List<PersonalEntity>> listaPersonal(){
        List<PersonalEntity> list = personalService.listaPersonal();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/createPersonal")
    public ResponseEntity<?> createPersonal(@RequestBody PersonalDto personalDto){

        System.out.println(personalDto.getIdentificacion()+ " " + personalDto.getNombrePersona() + " " + personalDto.getApellidoPersona() + " " + personalDto.getSexoPersona() + " " + personalDto.getCorreoPersona() + " " + personalDto.getTelefonoPersona() + " " + personalDto.getDireccionPersona() + " " + personalDto.getFechaNacimientoPersona() + " " + personalDto.getOcupacion() + " " + personalDto.getEstadoCivil());

        if(StringUtils.isBlank(personalDto.getIdentificacion())){
            return new ResponseEntity(new Mensaje("Este campo identificacion es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getNombrePersona())){
            return new ResponseEntity(new Mensaje("Este campo nombre es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getApellidoPersona())){
            return new ResponseEntity(new Mensaje("Este campo apellido es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getSexoPersona())){
            return new ResponseEntity(new Mensaje("Este campo genero es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getCorreoPersona())){
            return new ResponseEntity(new Mensaje("Este campo correo es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getTelefonoPersona())){
            return new ResponseEntity(new Mensaje("Este campo telefono es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getDireccionPersona())){
            return new ResponseEntity(new Mensaje("Este campo direccion es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getFechaNacimientoPersona().toString())){
            return new ResponseEntity(new Mensaje("Este campo fecha es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getOcupacion())){
            return new ResponseEntity(new Mensaje("Este campo ocupacion es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(personalDto.getEstadoCivil())){
            return new ResponseEntity(new Mensaje("Este campo estado civil es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        PersonalEntity personal = new PersonalEntity(0,personalDto.getIdentificacion(), personalDto.getNombrePersona(), personalDto.getApellidoPersona(), personalDto.getSexoPersona(), personalDto.getCorreoPersona(), personalDto.getTelefonoPersona(), personalDto.getDireccionPersona(), personalDto.getFechaNacimientoPersona(), personalDto.getOcupacion(), personalDto.getEstadoCivil());
        personalService.savePersonal(personal);
        return new ResponseEntity(new Mensaje("Se guardo correctamente"), HttpStatus.CREATED);
    }
}
