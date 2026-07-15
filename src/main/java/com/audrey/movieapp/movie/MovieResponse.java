package com.audrey.movieapp.movie;

import java.time.LocalDate;

public record MovieResponse(
    Long id,
    String title,
    String description,
    LocalDate releaseDate,
    Integer durationMinutes,
    String posterUrl
) {}