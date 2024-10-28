package com.vedruna.api_rest_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.api_rest_n_m.persistance.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByUsername(String username);

    void deleteById(Long idplayer);

    void updateByUsername(String username);

    void createPlayer(Player player);
    
}