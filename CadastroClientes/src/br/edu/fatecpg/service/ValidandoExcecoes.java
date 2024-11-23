package br.edu.fatecpg.service;

import br.edu.fatecpg.exception.ExcecaoEmail;
import br.edu.fatecpg.exception.ExcecaoNome;

public class ValidandoExcecoes {

    public void ValidarNome(String nome) throws ExcecaoNome {
        if (nome.isEmpty()) {
            throw new ExcecaoNome();
        }
    }

    public void ValidarEmail(String email) throws ExcecaoEmail {
        if (!email.contains("@")) {
            throw new ExcecaoEmail();
        }
    }
}
