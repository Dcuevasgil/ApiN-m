package com.vedruna.api_rest_n_m.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatePlayerHasTrophiesDTO {

    private Long playerId;  // ID del jugador
    private Long trophyId;   // ID del trofeo
}
