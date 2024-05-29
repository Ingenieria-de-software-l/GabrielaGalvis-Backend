package com.generador.generadorrrrHDV.repository;

import com.generador.generadorrrrHDV.entity.LaboralEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LaboralRepository extends JpaRepository<LaboralEntity, String> {

    Optional<LaboralEntity> findByNombreEmpresa(String nombreEmpresa);

}
