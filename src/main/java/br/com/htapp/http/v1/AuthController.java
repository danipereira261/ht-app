package br.com.htapp.http.v1;

import br.com.htapp.http.domain.AuthDTO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/auth")
@Api(tags = "Auth", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class AuthController {


    @PostMapping(path = "/token")
    @ResponseStatus(HttpStatus.OK)
    public void token(@RequestBody AuthDTO dto) {

        System.out.println(dto);
    }
}
