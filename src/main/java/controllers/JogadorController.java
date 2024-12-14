
package com.exemplo.jogodamilhao.controller;

import com.exemplo.jogodamilhao.model.Jogador;
import com.exemplo.jogodamilhao.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org .springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/")
    public String mostrarInicio(Model model) {
        List<Jogador> topJogadores = jogadorService.listarTopJogadores();
        model.addAttribute("topJogadores", topJogadores);
        return "index";
    }

    @PostMapping("/iniciar-jogo")
    public String iniciarJogo(@RequestParam String nickname, Model model) {

        jogadorService.salvarJogador(nickname, 0);
        return "redirect:/";
    }
}