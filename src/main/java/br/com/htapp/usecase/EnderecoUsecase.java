package br.com.htapp.usecase;

import br.com.htapp.database.entity.pessoa.EnderecoEntity;
import br.com.htapp.database.repository.EnderecoRepository;
import br.com.htapp.http.domain.EnderecoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoUsecase {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void update(Long id, EnderecoDTO dto) {
        EnderecoEntity entity = enderecoRepository.findById(id).get();

        enderecoRepository
                .save(
                        EnderecoEntity
                                .builder()
                                .id(entity.getId())
                                .cep(dto.getCep())
                                .rua(dto.getRua())
                                .bairro(dto.getBairro())
                                .municipio(dto.getMunicipio())
                                .estado(dto.getEstado())
                                .uf(dto.getUf())
                                .numeroLogradouro(dto.getNumeroLogradouro())
                                .build()
                );
    }
}
