package br.com.htapp.usecase;

import br.com.htapp.database.repository.RegistroAtividadadeFisicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistroAtividadeFisicaUsecase {

    @Autowired
    private RegistroAtividadadeFisicaRepository repository;
}
