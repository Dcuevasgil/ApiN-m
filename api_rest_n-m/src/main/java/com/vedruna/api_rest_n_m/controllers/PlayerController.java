package com.vedruna.api_rest_n_m.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.api_rest_n_m.dto.CreatePlayerDTO;
import com.vedruna.api_rest_n_m.dto.PlayerDTO;
import com.vedruna.api_rest_n_m.persistance.models.Player;
import com.vedruna.api_rest_n_m.services.PlayerServiceI;

@RestController
@CrossOrigin
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerServiceI playerService;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }

    @PostMapping
    public Player createPlayer(@RequestBody CreatePlayerDTO createPlayerDTO) {
        Player player = new Player();
        player.setUsername(createPlayerDTO.getUsername());
        return playerService.save(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }

    @PostMapping("/{playerId}/trophies/{trophyId}")
    public void awardTrophy(@PathVariable Long playerId, @PathVariable Long trophyId) {
        playerService.awardTrophy(playerId, trophyId);
    }
}