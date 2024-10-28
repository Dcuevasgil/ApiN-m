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

import com.vedruna.api_rest_n_m.persistance.models.PlayerHasTrophies;
import com.vedruna.api_rest_n_m.services.PlayerHasTrophiesServiceI;

@RestController
@CrossOrigin
@RequestMapping("/api/players_trophies")
public class PlayerHasTrophiesController {

    @Autowired
    private PlayerHasTrophiesServiceI playerHasTrophiesService;

    @GetMapping
    public List<PlayerHasTrophies> getAllPlayerTrophies() {
        return playerHasTrophiesService.getAllPlayerTrophies();
    }

    @PostMapping
    public PlayerHasTrophies savePlayerHasTrophy(@RequestBody PlayerHasTrophies playerHasTrophies) {
        return playerHasTrophiesService.savePlayerHasTrophy(playerHasTrophies);
    }

    @DeleteMapping("/{id}")
    public void deletePlayerHasTrophy(@PathVariable Long id) {
        playerHasTrophiesService.deletePlayerHasTrophy(id);
    }
}