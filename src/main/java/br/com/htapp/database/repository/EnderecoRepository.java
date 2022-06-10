package br.com.htapp.database.repository;

import br.com.htapp.database.entity.pessoa.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

}
