package com.generador.generadorrrrHDV.services;


import com.generador.generadorrrrHDV.dto.EstudioDto;
import com.generador.generadorrrrHDV.dto.LaboralDto;
import com.generador.generadorrrrHDV.dto.PersonalDto;
import com.generador.generadorrrrHDV.dto.ReferenciaDto;
import com.generador.generadorrrrHDV.dto.UsuarioDto;
import com.generador.generadorrrrHDV.entity.EstudioEntity;
import com.generador.generadorrrrHDV.entity.LaboralEntity;
import com.generador.generadorrrrHDV.entity.PersonalEntity;
import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import com.generador.generadorrrrHDV.entity.UsuarioEntity;
import com.generador.generadorrrrHDV.repository.EstudioRepository;
import com.generador.generadorrrrHDV.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> list() {
        return usuarioRepository.findAll();
    }

    public void save(UsuarioEntity usuario) {
        usuarioRepository.save(usuario);
    }

    public UsuarioEntity mapToEntity(UsuarioDto dto) {
        return new UsuarioEntity(0,
            mapToEntity(dto.getPersonal()),
            mapToEntity(dto.getEstudio()),
            mapToEntity(dto.getReferencia()),
            mapToEntity(dto.getLaboral())
        );
    }


    private PersonalEntity mapToEntity(PersonalDto dto) {
        // implement the mapping logic
        return new PersonalEntity(/* map fields from dto */);
    }

    public Optional<UsuarioEntity> getOne(Long id){
        return usuarioRepository.findById(id);
    }

    private EstudioEntity mapToEntity(EstudioDto dto) {
        // implement the mapping logic
        return new EstudioEntity(/* map fields from dto */);
    }

    private ReferenciaEntity mapToEntity(ReferenciaDto dto) {
        // implement the mapping logic
        return new ReferenciaEntity(/* map fields from dto */);
    }

    private LaboralEntity mapToEntity(LaboralDto dto) {
        // implement the mapping logic
        return new LaboralEntity(/* map fields from dto */);
    }
}
