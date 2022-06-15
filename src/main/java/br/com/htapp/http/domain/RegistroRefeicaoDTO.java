package br.com.htapp.http.domain;

import br.com.htapp.enums.TipoRefeicao;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroRefeicaoDTO {

    private long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "10/10/1985")
    private LocalDate dataRegistro;
    private TipoRefeicao tipoRefeicao;
    @ApiModelProperty(example = "100")
    private Integer quantidadeEmGramas;
    @ApiModelProperty(example = "Brocules")
    private String descricao;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
}
