package com.generador.generadorrrrHDV.repository;

import com.generador.generadorrrrHDV.entity.EstudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface EstudioRepository extends JpaRepository<EstudioEntity, String> {

    Optional<EstudioEntity> findByNombre(String nombreInstituto);

}
