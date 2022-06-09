package com.dh.movie.service;

import com.dh.movie.entity.Movie;

import java.util.List;

public interface IMovieService {
    void save(Movie movie);
    List<Movie> findByGenre (String genre);
}
