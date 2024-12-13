package repository;

import models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class JogadorRepository {

    public interface jogadorRepository extends JpaRepository<Jogador, Long> {

        List<Jogador> findTop10ByOrderByIdDesc();
    }
}
