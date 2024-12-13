package controllers;

import models.Jogador;
import org.springframework.ui.Model;
import repository.JogadorRepository;

import java.util.List;

public class Jogo_do_MilhaoController {

    private JogadorRepository jogadorRepository;

    public String mostrarPaginaInicial(Model model){

        List<Jogador> topJogadores = JogadorRepository.
    }
}
