package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroAtividadeFisicaEntity;
import br.com.htapp.database.repository.RegistroAtividadadeFisicaRepository;
import br.com.htapp.http.domain.RegistroAtividadeFisicaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RegistroAtividadeFisicaUsecase {

    @Autowired
    private RegistroAtividadadeFisicaRepository repository;

    public void save(RegistroAtividadeFisicaDTO dto) {
        repository.save(RegistroAtividadeFisicaEntity
                .builder()
                .dataRegistro(dto.getDataRegistro())
                .duracaoEmMinutos(10)
                .tipoAtividadeFisica(dto.getTipoAtividadeFisica())
                .cpf(dto.getCpf())
                .build()
        );
    }

    public List<RegistroAtividadeFisicaEntity> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public void removeById(Long id) {
        repository.deleteById(id);
    }
}
