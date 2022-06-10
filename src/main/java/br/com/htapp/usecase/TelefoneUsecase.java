package br.com.htapp.usecase;

import br.com.htapp.database.entity.pessoa.TelefoneEntity;
import br.com.htapp.database.repository.TelefoneRepository;
import br.com.htapp.http.domain.TelefoneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneUsecase {

    @Autowired
    private TelefoneRepository repository;

    public void update(Long id, TelefoneDTO dto) {
        TelefoneEntity entity = repository.findById(id).get();
        repository
                .save(
                        TelefoneEntity
                                .builder()
                                .id(entity.getId())
                                .numero(dto.getNumero())
                                .tipoTelefone(dto.getTipoTelefone())
                                .build()
                );
    }
}
