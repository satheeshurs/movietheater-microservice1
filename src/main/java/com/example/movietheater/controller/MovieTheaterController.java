package com.example.movietheater.controller;

import com.example.movietheater.model.MovieTheater;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/theater")
public class MovieTheaterController {

    @RequestMapping("")
    public List<MovieTheater> getTheaters() {
        return getData();
    }

    @RequestMapping("/{movieName}")
    public List<MovieTheater> getTheater(@PathVariable String movieName) {
        return getData().stream().filter(movie->movie.getMovieName().equalsIgnoreCase(movieName)).collect(Collectors.toList());
    }

    public List<MovieTheater> getData(){
        List<MovieTheater> movieTheaters = new ArrayList<>();
        movieTheaters.add(new MovieTheater("Singam","Sangith","Bangalore"));
        movieTheaters.add(new MovieTheater("Singam2","Abirami","Chennai"));
        movieTheaters.add(new MovieTheater("Singam3","Inox","Erode"));
        movieTheaters.add(new MovieTheater("Indian","Sangith","Bangalore"));
        movieTheaters.add(new MovieTheater("Indian2","Abirami","Chennai"));
        return movieTheaters;
    }


}
