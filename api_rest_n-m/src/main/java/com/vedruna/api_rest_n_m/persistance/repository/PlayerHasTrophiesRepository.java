package com.vedruna.api_rest_n_m.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.api_rest_n_m.persistance.models.PlayerHasTrophies;

public interface PlayerHasTrophiesRepository extends JpaRepository<PlayerHasTrophies, Long> {

    List<PlayerHasTrophies> findByPlayerIdplayer(Long idplayer);

    List<PlayerHasTrophies> findByTrophyIdtrophie(Long idtrophie);

    List<PlayerHasTrophies> findByPlayerIdplayerAndTrophyIdtrophie(Long idplayer, Long idtrophie);

    void deleteByPlayerIdplayerAndTrophyIdtrophie(Long idplayer, Long idtrophie);

    void deleteByPlayerIdplayer(Long idplayer);

    void deleteByTrophyIdtrophie(Long idtrophie);

}