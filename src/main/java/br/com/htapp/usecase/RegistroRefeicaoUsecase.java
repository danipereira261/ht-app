package br.com.htapp.usecase;

import br.com.htapp.database.entity.registro.RegistroRefeicaoEntity;
import br.com.htapp.database.repository.RegistroRefeicaoRepository;
import br.com.htapp.http.domain.RegistroRefeicaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroRefeicaoUsecase {

    @Autowired
    private RegistroRefeicaoRepository repository;

    public void save(RegistroRefeicaoDTO dto) {
        repository.save(
                RegistroRefeicaoEntity
                        .builder()
                        .dataRegistro(dto.getDataRegistro())
                        .tipoRefeicao(dto.getTipoRefeicao())
                        .quantidadeEmGramas(dto.getQuantidadeEmGramas())
                        .descricao(dto.getDescricao())
                        .cpf(dto.getCpf())
                        .build());
    }

    public List<RegistroRefeicaoEntity> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public void removeById(Long id) {
        repository.deleteById(id);
    }
}


