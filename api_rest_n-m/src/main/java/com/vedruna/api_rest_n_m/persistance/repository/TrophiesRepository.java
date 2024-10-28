package com.vedruna.api_rest_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.api_rest_n_m.persistance.models.Trophies;

public interface TrophiesRepository extends JpaRepository<Trophies, Long> {
    List<Trophies> findAll();

    List<Trophies> findByTitle(String title);

    void deleteByTitle(String title);

    void updateByTitle(String title);

    void createTrophy(Trophies trophie);
}