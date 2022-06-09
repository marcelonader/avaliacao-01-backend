package com.dh.movie.controller;


import com.dh.movie.entity.Movie;
import com.dh.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private IMovieService service;

    @PostMapping
    public ResponseEntity<Void>save(@RequestBody Movie movie){
        service.save(movie);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<?> findMovies(@PathVariable String genre){
        List<Movie> movies = service.findByGenre(genre);
        return !movies.isEmpty() ? ResponseEntity.ok(movies) : ResponseEntity.noContent().build();
    }
}
