package br.com.htapp.http.v1;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/registro-refeicao")
@Api(tags = "Monitoramento", produces = APPLICATION_JSON_VALUE)
public class RegistroRefeicaoController {


    //    @PostMapping
    //    @GetMapping
    //    @PutMapping
}
