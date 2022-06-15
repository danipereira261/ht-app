package br.com.htapp.http.v1;

import br.com.htapp.database.entity.registro.RegistroAtividadeFisicaEntity;
import br.com.htapp.database.entity.registro.RegistroRefeicaoEntity;
import br.com.htapp.http.domain.RegistroAtividadeFisicaDTO;
import br.com.htapp.usecase.RegistroAtividadeFisicaUsecase;
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
@RequestMapping(path = "/api/v1/registro-atividade-fisica")
@Api(tags = "Monitoramento Atividade Fisica", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class RegistroAtividadeFisicaController {

    @Autowired
    private RegistroAtividadeFisicaUsecase usecase;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody RegistroAtividadeFisicaDTO dto) {
        usecase.save(dto);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<RegistroAtividadeFisicaEntity> findByCpf(@RequestParam("cpf") @ApiParam(example = "35272352807") String cpf) {
        return usecase.findByCpf(cpf);
    }

    @DeleteMapping
    public void removeByCpf(@RequestParam("id") @ApiParam(example = "1") Long id){
         usecase.removeById(id);
    }
}
