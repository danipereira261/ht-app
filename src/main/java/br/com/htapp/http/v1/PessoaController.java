package br.com.htapp.http.v1;

import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.http.domain.PessoaUpdateDTO;
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
@RequestMapping(path = "/api/v1/pessoa")
@Api(tags = "Pessoas", produces = APPLICATION_JSON_VALUE)
public class PessoaController {

    @Autowired
    private PessoaUsecase usecase;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody PessoaDTO dto) {
        usecase.save(dto);
    }

    @GetMapping(path = "/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public PessoaDTO findByCpf(@RequestParam("cpf") @ApiParam(example = "35272352807") String cpf) {
        return usecase.findByCpf(cpf);
    }

    @PutMapping(path = "/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public void update(
            @RequestParam("cpf") @ApiParam(example = "35272352807") String cpf,
            @RequestBody PessoaUpdateDTO dto
    ) {
        usecase.update(cpf, dto);
    }
}
