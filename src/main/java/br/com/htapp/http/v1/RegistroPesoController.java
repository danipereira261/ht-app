package br.com.htapp.http.v1;

import br.com.htapp.database.entity.registro.RegistroPesoEntity;
import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.http.domain.RegistroPesoDTO;
import br.com.htapp.usecase.RegistroPesoUsecase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@Slf4j
@RestController
@RequestMapping(path = "/api/v1/registro-peso")
@Api(tags = "Monitoramento Peso", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class RegistroPesoController {

    @Autowired
    private RegistroPesoUsecase usecase;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody RegistroPesoDTO dto) {
        usecase.save(dto);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<RegistroPesoEntity> findByCpf(@RequestParam("cpf") @ApiParam(example = "35272352807") String cpf) {
        return usecase.findByCpf(cpf);
    }
}
