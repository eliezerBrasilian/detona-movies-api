package detona.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class DetonaMoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetonaMoviesApiApplication.class, args);
	}

}

record Movie(String id,
			 String picture,
			 String title, String description,
			 @JsonProperty("release_date")
			 Long releaseDate, int rating){ }

@RequestMapping("detona-movies-api")
@RestController
class MovieController{
	@GetMapping
	List<Movie> getMovies(){
        return List.of(
                new Movie("2", "https://f001.backblazeb2.com/file/papocine/2017/03/20170420-corra-papo-de-cinema-cartaz.jpg", "Corra!",
                        "Um jovem negro descobre segredos perturbadores ao visitar a família de sua namorada branca.",
                        1490918400000L, 8),
                new Movie("3", "https://cdn.culturagenial.com/imagens/0013923-0-cke.jpg?class=article", "Infiltrado na Klan",
                        "A história real de um policial negro que se infiltrou na Ku Klux Klan nos anos 1970.",
                        1533859200000L, 8),
                new Movie("5", "https://cdn.culturagenial.com/imagens/parasita-cartaz-cke.jpg", "Parasita",
                        "Uma família pobre se infiltra na vida de uma família rica, resultando em consequências inesperadas.",
                        1572393600000L, 10),
                new Movie("6", "https://br.web.img2.acsta.net/c_310_420/medias/nmedia/18/87/81/22/19961797.jpg", "O Hospedeiro",
                        "Um monstro gigante emerge do rio Han e aterroriza Seul, enquanto uma família luta para salvar sua filha.",
                        1151443200000L, 8),
                new Movie("7", "https://i.assistir.biz/t/p/w342/o4pkvVh8BPFOawIJ79dgoD5wvvZ.jpg", "Oldboy",
                        "Após ser mantido em cativeiro por 15 anos, um homem busca vingança contra seus captores.",
                        1066953600000L, 9),
				new Movie("4", "https://www.claquete.com/fotos/filmes/poster/8200_medio.jpgg", "Estrelas Além do Tempo",
						"Três matemáticas negras desafiam preconceitos e ajudam a NASA a lançar o primeiro homem ao espaço.",
						1483142400000L, 8),
                new Movie("10", "https://ingresso-a.akamaihd.net/b2b/production/uploads/movie/poster/97/vingadores.jpg", "Vingadores: Ultimato",
                        "Os Vingadores se reúnem para enfrentar Thanos em uma última tentativa de salvar o universo.",
                        1556150400000L, 9)
        );
	}
}