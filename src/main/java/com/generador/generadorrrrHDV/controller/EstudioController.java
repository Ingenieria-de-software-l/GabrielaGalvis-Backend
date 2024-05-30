package com.generador.generadorrrrHDV.controller;

import com.generador.generadorrrrHDV.dto.EstudioDto;
import com.generador.generadorrrrHDV.dto.Mensaje;
import com.generador.generadorrrrHDV.entity.EstudioEntity;
import com.generador.generadorrrrHDV.services.EstudioService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudio")
@CrossOrigin(origins="http://localhost:4200")
public class EstudioController {

    @Autowired
    EstudioService estudioService;

    @GetMapping("/listaEstudio")
    public ResponseEntity<List<EstudioEntity>> list(){
        List<EstudioEntity> list = estudioService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/createEstudio")
    public ResponseEntity<?> create(@RequestBody EstudioDto estudioDto){

        System.out.println(estudioDto.getNombreInstituto()+ " " + estudioDto.getLugarGrado() + " " + estudioDto.getAnio());
        if(StringUtils.isBlank(estudioDto.getNombreInstituto())){
            return new ResponseEntity(new Mensaje("Este campo nombre instituo es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(estudioDto.getLugarGrado())){
            return new ResponseEntity(new Mensaje("Este campo lugar de grado es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(estudioDto.getAnio().toString())){
            return new ResponseEntity(new Mensaje("Este campo año es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        EstudioEntity estudio = new EstudioEntity(0,estudioDto.getNombreInstituto(), estudioDto.getLugarGrado(), estudioDto.getAnio());
        estudioService.save(estudio);
        return new ResponseEntity(new Mensaje("Se guardo con exito la informacion"), HttpStatus.CREATED);
    }

    @PutMapping("/update/{nombreInstituto}")
    public ResponseEntity<?> update(@PathVariable("nombreInstituto") String nombreInstituto,@RequestBody EstudioDto estudioDto){
        if(StringUtils.isBlank(estudioDto.getNombreInstituto())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(estudioDto.getLugarGrado())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(estudioDto.getAnio().toString())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        EstudioEntity estudio = estudioService.getOne(nombreInstituto).get();
        estudio.setNombre(estudioDto.getNombreInstituto());
        estudio.setAnio(estudioDto.getAnio());
        estudio.setLugarGrado(estudioDto.getLugarGrado());
        estudioService.save(estudio);
        return new ResponseEntity(new Mensaje("Se actualizo la informacion"), HttpStatus.OK);
    }
}
