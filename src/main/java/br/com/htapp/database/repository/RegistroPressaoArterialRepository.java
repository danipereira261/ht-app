package br.com.htapp.database.repository;

import br.com.htapp.database.entity.registro.RegistroPressaoArterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroPressaoArterialRepository extends JpaRepository<RegistroPressaoArterialEntity, Long> {

    List<RegistroPressaoArterialEntity> findByCpf(String cpf);
}
