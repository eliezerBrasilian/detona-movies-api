package detona.api.services;

import detona.api.data.Movie;
import detona.api.exceptions.MovieNotFoundException;

import java.util.List;

public interface MovieService {
     List<Movie> getMovies();
    Movie getMovieById(String id) throws MovieNotFoundException;
}
