package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroPesoEntity;
import br.com.htapp.database.repository.RegistroPesoRepository;
import br.com.htapp.http.domain.RegistroPesoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RegistroPesoUsecase {

    @Autowired
    private RegistroPesoRepository repository;

    public void save(RegistroPesoDTO dto) {
        repository.save(RegistroPesoEntity
                .builder()
                .dataRegistro(dto.getDataRegistro())
                .peso(dto.getPeso())
                .cpf(dto.getCpf())
                .build()
        );
    }

    public List<RegistroPesoEntity> findByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
