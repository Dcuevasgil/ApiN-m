package com.vedruna.api_rest_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vedruna.api_rest_n_m.persistance.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByUsername(String username);

    @Query("SELECT p FROM Player p LEFT JOIN FETCH p.trophies")
    List<Player> findAllWithTrophies();

    @Query("SELECT p FROM Player p LEFT JOIN FETCH p.trophies WHERE p.idplayer = :id")
    Player findByIdWithTrophies(Long id);

    void deleteById(Long idplayer);

    void updateByUsername(String username);

    void createPlayer(Player player);
    
}