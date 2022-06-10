package br.com.htapp.http.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroPressaoArterialDTO {

    @ApiModelProperty(example = "12/15")
    private String medicaoPressao;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
}