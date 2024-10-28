package com.vedruna.api_rest_n_m.services;

import java.util.List;

import com.vedruna.api_rest_n_m.persistance.models.Player;

public interface PlayerServiceI {
    List<Player> getAllPlayers();
    Player getPlayerById(Long id);
    Player savePlayer(Player player);
    void deletePlayer(Long id);
}