package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroRefeicaoEntity;
import br.com.htapp.database.repository.RegistroRefeicaoRepository;
import br.com.htapp.http.domain.RegistroRefeicaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistroRefeicaoUsecase {

    @Autowired
    private RegistroRefeicaoRepository repository;

    public void save(RegistroRefeicaoDTO dto) {
        repository.save(
                RegistroRefeicaoEntity
                        .builder()
                        .dataRegistro(LocalDateTime.now())
                        .tipoRefeicao(dto.getTipoRefeicao())
                        .quantidadeEmGramas(dto.getQuantidadeEmGramas())
                        .descricao(dto.getDescricao())
                        .cpf(dto.getCpf())
                        .build());
    }
}


