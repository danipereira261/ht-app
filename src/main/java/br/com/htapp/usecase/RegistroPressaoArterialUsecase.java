package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroPressaoArterialEntity;
import br.com.htapp.database.repository.RegistroPressaoArterialRepository;
import br.com.htapp.http.domain.RegistroPressaoArterialDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistroPressaoArterialUsecase {

    @Autowired
    private RegistroPressaoArterialRepository repository;

    public void save(RegistroPressaoArterialDTO dto) {
        repository.save(
                RegistroPressaoArterialEntity
                        .builder()
                        .dataRegistro(LocalDateTime.now())
                        .medicao(dto.getMedicaoPressao())
                        .cpf(dto.getCpf())
                        .build());
    }
}
