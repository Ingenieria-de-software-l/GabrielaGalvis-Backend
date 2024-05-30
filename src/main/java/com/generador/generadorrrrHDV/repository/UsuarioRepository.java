package com.generador.generadorrrrHDV.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generador.generadorrrrHDV.entity.ReferenciaEntity;
import com.generador.generadorrrrHDV.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

       Optional<UsuarioEntity> findById(Long id);

}
