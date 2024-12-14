package com.exemplo.jogodamilhao.service;

import com.exemplo.jogodamilhao.model.Jogador;
import com.exemplo.jogodamilhao.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarTopJogadores() {
        return jogadorRepository.findTop10ByOrderByPontuacaoDesc();
    }

    public Jogador salvarJogador(String nickname, Integer pontuacao) {
        Jogador jogador = new Jogador();
        jogador.setNickname(nickname);
        jogador.setPontuacao(pontuacao);
        jogador.setDataPartida(LocalDateTime.now());
        return jogadorRepository.save(jogador);
    }
}
