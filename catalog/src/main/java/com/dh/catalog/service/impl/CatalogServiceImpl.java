package com.dh.catalog.service.impl;

import com.dh.catalog.service.ICatalogService;
import com.dh.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements ICatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<Object> getMovies(String genre) {
        return movieFeign.findMovies(genre);
    }
}
