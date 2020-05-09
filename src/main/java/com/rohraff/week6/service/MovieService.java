package com.rohraff.week6.service;

import com.rohraff.week6.aspect.AddMovie;
import com.rohraff.week6.model.Movie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    List<Movie> moviesList;

    public MovieService() {
        moviesList = new ArrayList<>();
        moviesList.add(new Movie("Fast and Furious 9", LocalDate.ofYearDay(2021, 1),"Vin Diesel" ));
        moviesList.add(new Movie("The Green Mile", LocalDate.ofYearDay(1999, 1),"Frank Darabont" ));
        moviesList.add(new Movie("300", LocalDate.ofYearDay(2006, 1),"Zack Snyder" ));
    }

    public List<Movie> getMovieList() {
        return moviesList;
    }

    @AddMovie
    public boolean addMovie(Movie movie) {
        return moviesList.add(movie);
    }
}
