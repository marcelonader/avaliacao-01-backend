package com.dh.catalog.controller;

import com.dh.catalog.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {

    @Autowired
    private ICatalogService catalogService;

    @GetMapping("/{genre}")
    public ResponseEntity<?> findMovie(@PathVariable String genre){
        List<Object> movies = catalogService.getMovies(genre);
        return !movies.isEmpty() ? ResponseEntity.ok(movies) : ResponseEntity.noContent().build();
    }
}
