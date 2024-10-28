package com.vedruna.api_rest_n_m.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.api_rest_n_m.persistance.models.PlayerHasTrophies;
import com.vedruna.api_rest_n_m.persistance.repository.PlayerHasTrophiesRepository;

@Service
public class PlayerHasTrophiesServiceImpl implements PlayerHasTrophiesServiceI {

    @Autowired
    private PlayerHasTrophiesRepository playerHasTrophiesRepository;

    @Override
    public List<PlayerHasTrophies> getAllPlayerTrophies() {
        return playerHasTrophiesRepository.findAll();
    }

    @Override
    public PlayerHasTrophies savePlayerHasTrophy(PlayerHasTrophies playerHasTrophies) {
        return playerHasTrophiesRepository.save(playerHasTrophies);
    }

    @Override
    public void deletePlayerHasTrophy(Long id) {
        playerHasTrophiesRepository.deleteById(id);
    }
}