package com.generador.generadorrrrHDV.repository;

import com.generador.generadorrrrHDV.entity.PersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonalRepository extends JpaRepository<PersonalEntity, String> {

    Optional<PersonalEntity> findByIdentificacion(String identificacion);

}
