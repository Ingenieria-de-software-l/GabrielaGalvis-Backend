package com.generador.generadorrrrHDV.controller;

import com.generador.generadorrrrHDV.dto.Mensaje;
import com.generador.generadorrrrHDV.dto.UsuarioDto;
import com.generador.generadorrrrHDV.entity.EstudioEntity;
import com.generador.generadorrrrHDV.entity.LaboralEntity;
import com.generador.generadorrrrHDV.entity.PersonalEntity;
import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import com.generador.generadorrrrHDV.entity.UsuarioEntity;
import com.generador.generadorrrrHDV.services.EstudioService;
import com.generador.generadorrrrHDV.services.LaboralService;
import com.generador.generadorrrrHDV.services.PersonalService;
import com.generador.generadorrrrHDV.services.ReferenciaService;
import com.generador.generadorrrrHDV.services.UsuarioService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins="http://localhost:4200")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    PersonalService personalService;

    @Autowired
    EstudioService estudioService;

    @Autowired
    ReferenciaService referenciaService;

    @Autowired
    LaboralService laboralService;
    

    @GetMapping("/listaUsuario")
    public ResponseEntity<List<UsuarioEntity>> list(){
        List<UsuarioEntity> list = usuarioService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/createUsuario")
    public ResponseEntity<?> create(@RequestBody UsuarioDto usuarioDto) {

        ReferenciaEntity referencia = usuarioService.mapToEntity(usuarioDto.getReferencia());
        EstudioEntity estudio = usuarioService.mapToEntity(usuarioDto.getEstudio());
        PersonalEntity personal = usuarioService.mapToEntity(usuarioDto.getPersonal());
        LaboralEntity laboral = usuarioService.mapToEntity(usuarioDto.getLaboral());
        
        //UsuarioEntity usuario = usuarioService.mapToEntity(usuarioDto);


        UsuarioEntity usuario = new UsuarioEntity(0, personal, estudio, referencia, laboral);
        usuarioService.save(usuario);
        return new ResponseEntity<>(new Mensaje("Se guardo con exito la informacion"), HttpStatus.CREATED);
    }
   /* @PostMapping("/createUsuario")
    public ResponseEntity<?> create(@RequestBody UsuarioDto usuarioDto){
        if(StringUtils.isBlank(usuarioDto.getPersonal())){
            return new ResponseEntity(new Mensaje("Este campo personal es obligatorio "), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getEstudio())){
            return new ResponseEntity(new Mensaje("Este campo estudio es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getReferencia())){
            return new ResponseEntity(new Mensaje("Este campo referencia es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getLaboral())){
            return new ResponseEntity(new Mensaje("Este campo laboral es obligatorio"), HttpStatus.BAD_REQUEST);
        }

       
        UsuarioEntity usuario = new UsuarioEntity(usuarioDto.getPersonal(), usuarioDto.getEstudio(), usuarioDto.getReferencia(), usuarioDto.getLaboral());
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("Se guardo con exito la informacion"), HttpStatus.CREATED);
    }
*/
    /*@PutMapping("/update/{personal}")
    public ResponseEntity<?> update(@PathVariable("personal") String personal,@RequestBody UsuarioDto usuarioDto){
        if(StringUtils.isBlank(usuarioDto.getPersonal())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getEstudio())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getReferencia())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(usuarioDto.getLaboral())){
            return new ResponseEntity(new Mensaje("Este campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }*/

        /*UsuarioEntity usuario = new UsuarioEntity(usuarioDto.getPersonal(), usuarioDto.getEstudio(), usuarioDto.getReferencia(), usuarioDto.getLaboral());
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("Se actualizo con exito la informacion"), HttpStatus.CREATED);
    }*/

    /*  @DeleteMapping("/delete/{personal}")
    public ResponseEntity<?> delete(@PathVariable("personal") String personal){
        if(StringUtils.isBlank(personal)){
            return new ResponseEntity(new Mensaje("Este campo)) es obligatorio"), HttpStatus.BAD_REQUEST);
        }
    }*/

    @GetMapping("/detail/{personal}")
    public ResponseEntity<UsuarioEntity> getById(@PathVariable("personal") Long personal){
        if(usuarioService.getOne(personal)==null){
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        UsuarioEntity usuario = usuarioService.getOne(personal).get();
        return new ResponseEntity(usuario, HttpStatus.OK);
    }

}
