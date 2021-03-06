package br.com.htapp.database.repository;

import br.com.htapp.database.entity.registro.RegistroRefeicaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroRefeicaoRepository extends JpaRepository<RegistroRefeicaoEntity, Long> {

    List<RegistroRefeicaoEntity> findByCpf(String cpf);
}
