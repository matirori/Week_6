package com.rohraff.week6.controller;

import com.rohraff.week6.aspect.AddMovie;
import com.rohraff.week6.model.Movie;
import com.rohraff.week6.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/movies")
public class MovieAPI {

    private MovieService movieService;

    @Autowired
    public MovieAPI(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public Iterable<Movie> getMovieList() {
         return movieService.getMovieList();
    }

    @PostMapping
    public ResponseEntity addMovie(@RequestBody Movie movie) {
        if (movieService.addMovie(movie)) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
