package br.com.htapp.database.repository;

import br.com.htapp.database.entity.pessoa.TelefoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<TelefoneEntity, Long> {


}
