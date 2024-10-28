package com.vedruna.api_rest_n_m.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.api_rest_n_m.persistance.models.Trophies;
import com.vedruna.api_rest_n_m.persistance.repository.TrophiesRepository;

@Service
public class TrophiesServiceImpl implements TrophiesServiceI {

    @Autowired
    private TrophiesRepository trophiesRepository;

    @Override
    public List<Trophies> getAllTrophies() {
        return trophiesRepository.findAll();
    }

    @Override
    public Trophies getTrophyById(Long id) {
        return trophiesRepository.findById(id).orElse(null);
    }

    @Override
    public Trophies saveTrophy(Trophies trophy) {
        return trophiesRepository.save(trophy);
    }

    @Override
    public void deleteTrophy(Long id) {
        trophiesRepository.deleteById(id);
    }

    @Override
    public Trophies save(Trophies trophy) {
        // Inicializar la colección de jugadores
        return trophiesRepository.save(trophy);
    }
}
