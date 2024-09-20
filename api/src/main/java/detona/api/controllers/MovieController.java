package detona.api.controllers;


import detona.api.data.Movie;
import detona.api.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("detona-movies-api")
@RestController
public class MovieController{

    @Autowired
    MovieService movieService;

    @GetMapping
    List<Movie> getMovies(){
        return movieService.getMovies();
    }
}