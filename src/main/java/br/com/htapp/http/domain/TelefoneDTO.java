package br.com.htapp.http.domain;

import br.com.htapp.database.entity.pessoa.TelefoneEntity;
import br.com.htapp.enums.TipoTelefone;
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
public class TelefoneDTO {

    private long id;
    @ApiModelProperty(example = "11972026904")
    private String numero;
    @Enumerated(EnumType.STRING)
    private TipoTelefone tipoTelefone;

    public TelefoneDTO(TelefoneEntity entity) {
        this.id = entity.getId();
        this.numero = entity.getNumero();
        this.tipoTelefone = entity.getTipoTelefone();
    }
}
