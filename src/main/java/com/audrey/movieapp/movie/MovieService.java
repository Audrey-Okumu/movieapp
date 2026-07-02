package com.audrey.movieapp.movie;

import org.springframework.stereotype.Service;

import com.audrey.movieapp.common.exception.ResourceNotFoundException;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie getMovieById(Long id) {
    return movieRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Movie not found with id: " + id));
}
}

