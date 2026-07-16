package com.audrey.movieapp.movie;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public record MovieRequest(
    @NotBlank(message = "Title is required")
    String title,

    String description,

    LocalDate releaseDate,

    Integer durationMinutes,

    String posterUrl
) {}