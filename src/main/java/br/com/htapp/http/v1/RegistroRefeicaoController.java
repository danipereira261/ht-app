package br.com.htapp.http.v1;

import br.com.htapp.http.domain.RegistroRefeicaoDTO;
import br.com.htapp.usecase.RegistroRefeicaoUsecase;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/registro-refeicao")
@Api(tags = "Monitoramento Refeicao", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class RegistroRefeicaoController {

    @Autowired
    private RegistroRefeicaoUsecase usecase;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody RegistroRefeicaoDTO dto) {
        usecase.save(dto);
    }
}
