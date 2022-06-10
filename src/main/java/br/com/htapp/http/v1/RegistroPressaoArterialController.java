package br.com.htapp.http.v1;

import br.com.htapp.usecase.RegistroPressaoArterialUsecase;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/registro-pressao-aterial")
@Api(tags = "Monitoramento", produces = APPLICATION_JSON_VALUE)
public class RegistroPressaoArterialController {

    @Autowired
    private RegistroPressaoArterialUsecase usecase;

    //    @PostMapping
    //    @GetMapping
    //    @PutMapping

}
