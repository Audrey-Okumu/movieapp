package com.audrey.movieapp.movie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.audrey.movieapp.common.exception.ResourceNotFoundException;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public MovieService(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    //Get a movie by id
    public MovieResponse getMovieById(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie not found with id: " + id));
        return movieMapper.toResponse(movie);
    }

    //List all movies
    public List<MovieResponse> getAllMovies() {
        return movieRepository.findAll().stream()
            .map(movieMapper::toResponse)
            .toList();
    }

    //Create a new Movie
    public MovieResponse createMovie(MovieRequest request) {
        Movie movie = movieMapper.toEntity(request);
        Movie saved = movieRepository.save(movie);
        return movieMapper.toResponse(saved);
    }

    
}