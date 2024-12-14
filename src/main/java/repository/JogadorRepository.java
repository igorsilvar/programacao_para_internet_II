
package com.exemplo.jogodamilhao.repository;

import com.exemplo.jogodamilhao.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    List<Jogador> findTop10ByOrderByPontuacaoDesc();
}