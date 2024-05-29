package com.generador.generadorrrrHDV.services;


import com.generador.generadorrrrHDV.entity.EstudioEntity;
import com.generador.generadorrrrHDV.repository.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EstudioService {

    @Autowired
    EstudioRepository estudioRepository;

    public List<EstudioEntity> list(){
        return estudioRepository.findAll();
    }

    public Optional<EstudioEntity> getOne(String nombreInstituto){
        return estudioRepository.findByNombre(nombreInstituto);
    }

    public void save(EstudioEntity estudioEntity){
        estudioRepository.save(estudioEntity);
    }

}
