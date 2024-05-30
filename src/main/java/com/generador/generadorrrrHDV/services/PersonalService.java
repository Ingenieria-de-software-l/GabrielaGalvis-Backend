package com.generador.generadorrrrHDV.services;

import com.generador.generadorrrrHDV.entity.PersonalEntity;
import com.generador.generadorrrrHDV.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    public List<PersonalEntity> listaPersonal() {
        return personalRepository.findAll();
    }

    public Optional<PersonalEntity> getOnePersonal(String id) {
        return personalRepository.findByIdentificacion(id);
    }

    public void save(PersonalEntity personal) {
        personalRepository.save(personal);
    }
}
