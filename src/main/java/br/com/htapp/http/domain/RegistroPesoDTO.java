package br.com.htapp.http.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistroPesoDTO {

    @ApiModelProperty(example = "10")
    private Double peso;
    @ApiModelProperty(example = "35272352807")
    private String cpf;
}
