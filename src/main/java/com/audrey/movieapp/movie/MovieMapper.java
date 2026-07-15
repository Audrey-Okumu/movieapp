package com.audrey.movieapp.movie;

import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieResponse toResponse(Movie movie) {
        return new MovieResponse(
            movie.getId(),
            movie.getTitle(),
            movie.getDescription(),
            movie.getReleaseDate(),
            movie.getDurationMinutes(),
            movie.getPosterUrl()
        );
    }
}