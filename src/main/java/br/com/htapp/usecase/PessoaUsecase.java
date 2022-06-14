package br.com.htapp.usecase;

import br.com.htapp.database.entity.pessoa.PessoaEntity;
import br.com.htapp.database.repository.PessoaRepository;
import br.com.htapp.exception.LoginFailException;
import br.com.htapp.exception.PessoaJaCadastradaException;
import br.com.htapp.http.domain.AuthDTO;
import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.http.domain.PessoaUpdateDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

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
                            .sexo(dto.getSexo())
                            .dataNascimento(dto.getDataNascimento())
                            .cpf(dto.getCpf())
                            .password(dto.getPassword())
                            .email(dto.getEmail())
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
                .sexo(entity.getSexo())
                .dataNascimento(entity.getDataNascimento())
                .cpf(entity.getCpf())
                .password(entity.getPassword())
                .email(entity.getEmail())
                .build();
    }

    public void update(String cpf, PessoaUpdateDTO dto) {
        PessoaEntity entity = repository.findByCpf(cpf);

        repository.save(
                PessoaEntity
                        .builder()
                        .id(entity.getId())
                        .nome(dto.getNome())
                        .sexo(dto.getTipoSexo())
                        .dataNascimento(dto.getDataNascimento())
                        .cpf(dto.getCpf())
                        .email(dto.getEmail())
                        .build()
        );
    }

    public PessoaEntity findPessoaPorUsuarioESenha(AuthDTO dto) {
        PessoaEntity entity;
        try {
            entity = repository.findByEmail(dto.getEmail());

        } catch (Exception e) {
            throw new LoginFailException();
        }

        if (entity == null) {
            throw new LoginFailException();
        }

        if (!dto.getPassword().equals(entity.getPassword())) {
            throw new LoginFailException();
        }

        if (!dto.getEmail().equals(entity.getEmail())) {
            throw new LoginFailException();
        }
        return entity;
    }
}
