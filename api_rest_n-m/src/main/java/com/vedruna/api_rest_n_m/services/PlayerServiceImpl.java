package com.vedruna.api_rest_n_m.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.api_rest_n_m.persistance.models.Player;
import com.vedruna.api_rest_n_m.persistance.models.Trophies;
import com.vedruna.api_rest_n_m.persistance.repository.PlayerRepository;
import com.vedruna.api_rest_n_m.persistance.repository.TrophiesRepository;

@Service
public class PlayerServiceImpl implements PlayerServiceI {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TrophiesRepository trophiesRepository;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAllWithTrophies();
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findByIdWithTrophies(id);
    }

    @Override
    public Player save(Player player) {
        // Inicializar la colección de trofeos
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public void awardTrophy(Long playerId, Long trophyId) {
        Player player = playerRepository.findById(playerId).orElseThrow(() -> new RuntimeException("Player not found"));
        Trophies trophy = trophiesRepository.findById(trophyId).orElseThrow(() -> new RuntimeException("Trophy not found"));

        playerRepository.save(player);
    }
}