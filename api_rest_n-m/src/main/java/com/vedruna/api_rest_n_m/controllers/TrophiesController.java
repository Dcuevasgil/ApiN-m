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

import com.vedruna.api_rest_n_m.persistance.models.Trophies;
import com.vedruna.api_rest_n_m.services.TrophiesServiceI;

@RestController
@CrossOrigin
@RequestMapping("/api/trophies")
public class TrophiesController {

    @Autowired
    private TrophiesServiceI trophiesService;

    @GetMapping
    public List<Trophies> getAllTrophies() {
        return trophiesService.getAllTrophies();
    }

    @GetMapping("/{id}")
    public Trophies getTrophyById(@PathVariable Long id) {
        return trophiesService.getTrophyById(id);
    }

    @PostMapping
    public Trophies saveTrophy(@RequestBody Trophies trophy) {
        return trophiesService.saveTrophy(trophy);
    }

    @DeleteMapping("/{id}")
    public void deleteTrophy(@PathVariable Long id) {
        trophiesService.deleteTrophy(id);
    }
}