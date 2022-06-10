package br.com.htapp.usecase;

import br.com.htapp.database.repository.RegistroPressaoArterialRepository;
import br.com.htapp.database.repository.RegistroRefeicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroRefeicaoUsecase {

    @Autowired
    private RegistroRefeicaoRepository repository;
}
