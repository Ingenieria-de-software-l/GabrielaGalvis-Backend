package com.generador.generadorrrrHDV.controller;

import com.generador.generadorrrrHDV.dto.Mensaje;
import com.generador.generadorrrrHDV.dto.ReferenciaDto;
import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import com.generador.generadorrrrHDV.services.ReferenciaService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referencia")
@CrossOrigin(origins="http://localhost:4200")
public class ReferenciaController {

    @Autowired
    ReferenciaService referenciaService;

    @GetMapping("/listaReferencia")
    public ResponseEntity<List<ReferenciaEntity>> listaReferencia(){
        List<ReferenciaEntity> list = referenciaService.listarReferencias();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/createReferencia")
    public ResponseEntity<?> createReferencia(@RequestBody ReferenciaDto referenciaDto){

        System.out.println(referenciaDto.getNombreRef()+ " " + referenciaDto.getOcupacionRef() + " " + referenciaDto.getParentesco() + " " + referenciaDto.getTelefono());
        if(StringUtils.isBlank(referenciaDto.getNombreRef())){
            return new ResponseEntity(new Mensaje("Este campo nombre persona es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(referenciaDto.getOcupacionRef())){
            return new ResponseEntity(new Mensaje("Este campo ocupacion es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(referenciaDto.getParentesco())){
            return new ResponseEntity(new Mensaje("Este campo parentesco es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(referenciaDto.getTelefono())){
            return new ResponseEntity(new Mensaje("Este campo telefono es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        ReferenciaEntity referencia = new ReferenciaEntity(0,referenciaDto.getNombreRef(), referenciaDto.getOcupacionRef(), referenciaDto.getParentesco(), referenciaDto.getTelefono());
        referenciaService.save(referencia);
        return new ResponseEntity(new Mensaje("Se guardo con exito la informacion"), HttpStatus.CREATED);
    }
}
