package br.com.htapp.http.v1;

import br.com.htapp.http.domain.EnderecoDTO;
import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.http.domain.PessoaUpdateDTO;
import br.com.htapp.usecase.EnderecoUsecase;
import br.com.htapp.usecase.PessoaUsecase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@Slf4j
@RestController
@RequestMapping(path = "/api/v1/endereco")
@Api(tags = "Endereco", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class EnderecoController {

    @Autowired
    private EnderecoUsecase usecase;

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(
            @RequestParam("id") @ApiParam(example = "1") Long id,
            @RequestBody EnderecoDTO dto
    ) {
        usecase.update(id, dto);
    }
}
