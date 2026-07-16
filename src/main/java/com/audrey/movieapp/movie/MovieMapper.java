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


    public Movie toEntity(MovieRequest request) {
        Movie movie = new Movie();
        
        movie.setTitle(request.title());
        movie.setDescription(request.description());
        movie.setReleaseDate(request.releaseDate());
        movie.setDurationMinutes(request.durationMinutes());
        movie.setPosterUrl(request.posterUrl());
        return movie;
    }
}