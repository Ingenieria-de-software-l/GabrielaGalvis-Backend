package com.generador.generadorrrrHDV.services;

import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import com.generador.generadorrrrHDV.repository.ReferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReferenciaService {

    @Autowired
    private ReferenciaRepository referenciaRepository;

    public List<ReferenciaEntity> listarReferencias(){
        return referenciaRepository.findAll();
    }

    public Optional<ReferenciaEntity> getOneRefencia(String referencia){
        return referenciaRepository.findByNombreRef(referencia);
    }

    public void save(ReferenciaEntity referencia){
        referenciaRepository.save(referencia);
    }
}
