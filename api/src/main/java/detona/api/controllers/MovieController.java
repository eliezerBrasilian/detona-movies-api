package detona.api.controllers;


import detona.api.data.Movie;
import detona.api.services.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Operation(summary = "Exibe uma lista de filmes.", method = "GET")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso ao buscar filmes"),
            @ApiResponse(responseCode = "500", description = "Erro interno ao realizar a busca de filmes"),
    })
    @GetMapping
    List<Movie> getMovies(){
        return movieService.getMovies();
    }
}