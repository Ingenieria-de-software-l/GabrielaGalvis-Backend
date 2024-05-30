package com.generador.generadorrrrHDV.controller;

import com.generador.generadorrrrHDV.dto.LaboralDto;
import com.generador.generadorrrrHDV.dto.Mensaje;
import com.generador.generadorrrrHDV.entity.LaboralEntity;
import com.generador.generadorrrrHDV.services.LaboralService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboral")
@CrossOrigin(origins="http://localhost:4200")
public class LaboralController {

    @Autowired
    LaboralService laboralService;

    @GetMapping("/listaLaboral")
    public ResponseEntity<List<LaboralEntity>> listaLaboral(){
        List<LaboralEntity> list = laboralService.listLaboral();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/createLaboral")
    public ResponseEntity<?> createLaboral(@RequestBody LaboralDto laboralDto){

        System.out.println(laboralDto.getNombreEmpresa()+ " " + laboralDto.getDireccionEmpresa() + " " + laboralDto.getTelefonoEmpresa() + " " + laboralDto.getNombreJefe() + " " + laboralDto.getFechaInicio() + " " + laboralDto.getFechaFin() + " " + laboralDto.getCargo());
        if(StringUtils.isBlank(laboralDto.getNombreEmpresa())){
            return new ResponseEntity(new Mensaje("Este campo nombre empresa es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getDireccionEmpresa())){
            return new ResponseEntity(new Mensaje("Este campo direccion empresa es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getTelefonoEmpresa())){
            return new ResponseEntity(new Mensaje("Este campo telefono empresa es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getNombreJefe())){
            return new ResponseEntity(new Mensaje("Campo nombre jefe es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getFechaInicio().toString())){
            return new ResponseEntity(new Mensaje("Este campo fecha inicio es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getFechaFin().toString())){
            return new ResponseEntity(new Mensaje("Este campo fecha fin es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(laboralDto.getCargo())){
            return new ResponseEntity(new Mensaje("Este campo cargo es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        LaboralEntity laboral = new LaboralEntity(0,laboralDto.getNombreEmpresa(), laboralDto.getDireccionEmpresa(), laboralDto.getTelefonoEmpresa(), laboralDto.getNombreJefe(), laboralDto.getFechaInicio(), laboralDto.getFechaFin(), laboralDto.getCargo());
        laboralService.save(laboral);
        return new ResponseEntity(new Mensaje("Se guardo con exito la informacion"), HttpStatus.CREATED);
    }

}
