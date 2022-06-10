package br.com.htapp.http.domain;

import br.com.htapp.database.entity.pessoa.EnderecoEntity;
import br.com.htapp.enums.Estados;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private long id;
    @ApiModelProperty(example = "07171100")
    private String cep;
    @ApiModelProperty(example = "ALPES")
    private String rua;
    @ApiModelProperty(example = "JD PRESIDENTE DUTRA")
    private String bairro;
    @ApiModelProperty(example = "GUARULHOS")
    private String municipio;
    @Enumerated(EnumType.STRING)
    private Estados estado;
    @ApiModelProperty(example = "SP")
    private String uf;
    @ApiModelProperty(example = "956")
    private String numeroLogradouro;

    public EnderecoDTO(EnderecoEntity entity) {
        this.id = entity.getId();
        this.cep = entity.getCep();
        this.rua = entity.getRua();
        this.municipio = entity.getMunicipio();
        this.bairro = entity.getBairro();
        this.estado = entity.getEstado();
        this.uf = entity.getUf();
        this.numeroLogradouro = entity.getNumeroLogradouro();
    }
}
