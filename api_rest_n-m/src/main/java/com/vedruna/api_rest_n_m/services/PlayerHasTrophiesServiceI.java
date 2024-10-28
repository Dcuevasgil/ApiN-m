package com.vedruna.api_rest_n_m.services;

import java.util.List;

import com.vedruna.api_rest_n_m.persistance.models.PlayerHasTrophies;

public interface PlayerHasTrophiesServiceI {
    List<PlayerHasTrophies> getAllPlayerTrophies();
    PlayerHasTrophies savePlayerHasTrophy(PlayerHasTrophies playerHasTrophies);
    void deletePlayerHasTrophy(Long id);
}
