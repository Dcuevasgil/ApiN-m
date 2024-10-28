package com.vedruna.api_rest_n_m.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatePlayerDTO {

    private Long idplayer;
    private String username;
}