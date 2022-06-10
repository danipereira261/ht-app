package br.com.htapp.usecase;

import br.com.htapp.database.repository.RegistroPressaoArterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroPressaoArterialUsecase {

    @Autowired
    private RegistroPressaoArterialRepository repository;
}
