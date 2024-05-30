package com.generador.generadorrrrHDV.repository;

import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReferenciaRepository extends JpaRepository<ReferenciaEntity, Long> {

        Optional<ReferenciaEntity> findByNombreRef(String referencia);

}
