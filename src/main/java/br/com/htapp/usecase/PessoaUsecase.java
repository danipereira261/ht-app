package br.com.htapp.usecase;

import br.com.htapp.database.entity.pessoa.EnderecoEntity;
import br.com.htapp.database.entity.pessoa.PessoaEntity;
import br.com.htapp.database.entity.pessoa.TelefoneEntity;
import br.com.htapp.database.repository.EnderecoRepository;
import br.com.htapp.database.repository.PessoaRepository;
import br.com.htapp.database.repository.TelefoneRepository;
import br.com.htapp.exception.PessoaJaCadastradaException;
import br.com.htapp.http.domain.EnderecoDTO;
import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.http.domain.TelefoneDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Slf4j
@Service
public class PessoaUsecase {

    @Autowired
    private PessoaRepository repository;

    public void save(PessoaDTO dto) {
        try {
            repository.save(
                    PessoaEntity
                            .builder()
                            .nome(dto.getNome())
                            .tipoSexo(dto.getTipoSexo())
                            .dataNascimento(dto.getDataNascimento())
                            .cpf(dto.getCpf())
                            .email(dto.getEmail())
                            .telefones(dto.getTelefones().stream().map(TelefoneEntity::new).collect(Collectors.toList()))
                            .enderecos(dto.getEnderecos().stream().map(EnderecoEntity::new).collect(Collectors.toList()))
                            .build()
            );
        } catch (DataIntegrityViolationException e) {
            throw new PessoaJaCadastradaException();
        }
    }

    public PessoaDTO findByCpf(String cpf) {
        PessoaEntity entity = repository.findByCpf(cpf);
        return PessoaDTO
                .builder()
                .nome(entity.getNome())
                .tipoSexo(entity.getTipoSexo())
                .dataNascimento(entity.getDataNascimento())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .telefones(entity.getTelefones().stream().map(TelefoneDTO::new).collect(Collectors.toList()))
                .enderecos(entity.getEnderecos().stream().map(EnderecoDTO::new).collect(Collectors.toList()))
                .build();
    }

    public void update(String cpf, PessoaDTO dto) {
        PessoaEntity entity = repository.findByCpf(cpf);

        repository.save(
                PessoaEntity
                        .builder()
                        .id(entity.getId())
                        .nome(dto.getNome())
                        .tipoSexo(dto.getTipoSexo())
                        .dataNascimento(dto.getDataNascimento())
                        .cpf(dto.getCpf())
                        .email(dto.getEmail())
                        .telefones(dto.getTelefones().stream().map(TelefoneEntity::new).collect(Collectors.toList()))
                        .enderecos(dto.getEnderecos().stream().map(EnderecoEntity::new).collect(Collectors.toList()))
                        .build()
        );

    }
}
