package com.topfilmes.api.models.filme;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FilmeDTO(
        String id,
        @JsonProperty("rank")
        int ranking,
        String title,
        String fullTitle,
        int year,
        String image,
        String crew,
        Double imDbRating,
        String imDbRatingCount
) {
}
