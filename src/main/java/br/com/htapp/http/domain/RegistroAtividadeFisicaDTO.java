package br.com.htapp.http.domain;

import br.com.htapp.enums.TipoAtividadeFisica;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroAtividadeFisicaDTO {

    @ApiModelProperty(example = "10")
    private Integer duracaoEmMinutos;
    private TipoAtividadeFisica tipoAtividadeFisica;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "10/10/1985")
    private LocalDate dataRegistro;
}
