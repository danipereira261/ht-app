package br.com.htapp.http.domain;

import br.com.htapp.enums.TipoRefeicao;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroRefeicaoDTO {

    private long id;
    private LocalDateTime dataRegistro;
    private TipoRefeicao tipoRefeicao;
    @ApiModelProperty(example = "100")
    private Integer quantidadeEmGramas;
    @ApiModelProperty(example = "Brocules")
    private String descricao;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
}
