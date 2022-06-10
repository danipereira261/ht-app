package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroPesoEntity;
import br.com.htapp.database.repository.RegistroPesoRepository;
import br.com.htapp.http.domain.RegistroPesoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class RegistroPesoUsecase {

    @Autowired
    private RegistroPesoRepository repository;

    public void save(RegistroPesoDTO dto) {
        repository.save(RegistroPesoEntity
                .builder()
                .dataRegistro(LocalDateTime.now())
                .peso(dto.getPeso())
                .cpf(dto.getCpf())
                .build()
        );
    }
}
