package br.com.htapp.database.repository;

import br.com.htapp.database.entity.registro.RegistroPesoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroPesoRepository extends JpaRepository<RegistroPesoEntity, Long> {
}
