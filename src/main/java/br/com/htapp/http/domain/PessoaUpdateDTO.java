package br.com.htapp.http.domain;

import br.com.htapp.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaUpdateDTO {

    @ApiModelProperty(example = "LUIZ HAMILTON")
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoSexo tipoSexo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "10/10/1985")
    private LocalDate dataNascimento;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
    @ApiModelProperty(example = "fesacaba@gmail.com")
    private String email;
}
