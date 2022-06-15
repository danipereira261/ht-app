package br.com.htapp.database.repository;

import br.com.htapp.database.entity.registro.RegistroAtividadeFisicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroAtividadadeFisicaRepository extends JpaRepository<RegistroAtividadeFisicaEntity, Long> {

    List<RegistroAtividadeFisicaEntity> findByCpf(String cpf);

}
