package com.vedruna.api_rest_n_m.services;

import java.util.List;

import com.vedruna.api_rest_n_m.persistance.models.Trophies;

public interface TrophiesServiceI {
    List<Trophies> getAllTrophies();
    Trophies getTrophyById(Long id);
    Trophies saveTrophy(Trophies trophy);
    void deleteTrophy(Long id);
    Trophies save(Trophies trophy); // Para crear un nuevo trofeo
}
