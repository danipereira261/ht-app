package br.com.htapp.http.v1;

import br.com.htapp.database.entity.registro.RegistroPressaoArterialEntity;
import br.com.htapp.http.domain.RegistroPressaoArterialDTO;
import br.com.htapp.usecase.RegistroPressaoArterialUsecase;
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
@RequestMapping(path = "/api/v1/registro-pressao-arterial")
@Api(tags = "Monitoramento Pressao Arterial", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class RegistroPressaoArterialController {

    @Autowired
    private RegistroPressaoArterialUsecase usecase;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody RegistroPressaoArterialDTO dto) {
        usecase.save(dto);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<RegistroPressaoArterialEntity> findByCpf(@RequestParam("cpf") @ApiParam(example = "35272352807") String cpf) {
        return usecase.findByCpf(cpf);
    }

    @DeleteMapping
    public void removeByCpf(@RequestParam("id") @ApiParam(example = "1") Long id){
        usecase.removeById(id);
    }
}
