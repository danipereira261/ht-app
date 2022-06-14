package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroPressaoArterialEntity;
import br.com.htapp.database.repository.RegistroPressaoArterialRepository;
import br.com.htapp.http.domain.RegistroPressaoArterialDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RegistroPressaoArterialUsecase {

    @Autowired
    private RegistroPressaoArterialRepository repository;

    public void save(RegistroPressaoArterialDTO dto) {
        log.info("Salvar registro de Pressao");

        repository.save(
                RegistroPressaoArterialEntity
                        .builder()
                        .dataRegistro(dto.getDataRegistro())
                        .medicao(dto.getMedicaoPressao())
                        .cpf(dto.getCpf())
                        .build());
    }

    public List<RegistroPressaoArterialEntity> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}
