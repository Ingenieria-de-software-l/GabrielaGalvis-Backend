package com.generador.generadorrrrHDV.services;

import com.generador.generadorrrrHDV.entity.LaboralEntity;
import com.generador.generadorrrrHDV.repository.LaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LaboralService {

    @Autowired
    private LaboralRepository laboralRepository;

    public List<LaboralEntity> listLaboral() {
        return laboralRepository.findAll();
    }

    public Optional<LaboralEntity> getOneLaboral(String nombreEmpresa) {
        return laboralRepository.findByNombreEmpresa(nombreEmpresa);
    }

    public void save(LaboralEntity laboral){
        laboralRepository.save(laboral);
    }
}
