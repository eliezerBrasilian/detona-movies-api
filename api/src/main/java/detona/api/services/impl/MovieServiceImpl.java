package detona.api.services.impl;

import detona.api.data.Category;
import detona.api.data.Movie;
import detona.api.services.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MovieServiceImpl implements MovieService {
    private List<Movie> movies;

    MovieServiceImpl(){
        movies = List.of(
                new Movie("1",
                        "https://f001.backblazeb2.com/file/papocine/2017/03/20170420-corra-papo-de-cinema-cartaz.jpg",
                        "Corra!",
                        "Um jovem negro descobre segredos perturbadores ao visitar a família de sua namorada branca.",
                        1490918400000L,
                        8,
                        "https://youtu.be/mDGV5UucTu8?si=zc-ywhAPqLp1oe2f",
                        Category.SUSPENSE
                ),
                new Movie("2",
                        "https://cdn.culturagenial.com/imagens/0013923-0-cke.jpg?class=article",
                        "Infiltrado na Klan",
                        "A história real de um policial negro que se infiltrou na Ku Klux Klan nos anos 1970.",
                        1533859200000L,
                        9,
                        "https://youtu.be/bbOJwWSEUmo?si=AUdg0W5TyHTw8959",
                        Category.DRAMA
                ),
                new Movie("3", "https://cdn.culturagenial.com/imagens/parasita-cartaz-cke.jpg",
                        "Parasita",
                        "Uma família pobre se infiltra na vida de uma família rica, resultando em consequências inesperadas.",
                        1572393600000L,
                        10,
                        "https://youtu.be/xFCrQy5IXI0?si=CXQhD2DQ4T9pcDLo",
                        Category.DOCUMENTARIO
                ),
                new Movie("4",
                        "https://br.web.img2.acsta.net/c_310_420/medias/nmedia/18/87/81/22/19961797.jpg",
                        "O Hospedeiro",
                        "Um monstro gigante emerge do rio Han e aterroriza Seul, enquanto uma família luta para salvar sua filha.",
                        1151443200000L, 8,
                        "https://youtu.be/HzqQVsgQu9g?si=SMot0ON4kpzHobl_",
                        Category.TERROR
                ),
                new Movie("5", "https://i.assistir.biz/t/p/w342/o4pkvVh8BPFOawIJ79dgoD5wvvZ.jpg",
                        "Oldboy",
                        "Após ser mantido em cativeiro por 15 anos, um homem busca vingança contra seus captores.",
                        1066953600000L, 9,
                        "https://youtu.be/tAaBkFChaRg?si=SOxYKsiDxFq5LiGn",
                        Category.SUSPENSE),
                new Movie("6", "https://www.claquete.com/fotos/filmes/poster/8200_medio.jpg",
                        "Estrelas Além do Tempo",
                        "Três matemáticas negras desafiam preconceitos e ajudam a NASA a lançar o primeiro homem ao espaço.",
                        1483142400000L, 8,
                        "https://youtu.be/wx3PVtrU-Os?si=y-V8nfotEjzVpzsj",
                        Category.DRAMA),
                new Movie("7", "https://image.tmdb.org/t/p/w1280//tAcDOFX0WludQhvTdmG2rDxyQRM.jpg",
                        "Homem de Ferro",
                        "Tony Stark, um bilionário genial e industrial, é capturado por terroristas e constrói uma poderosa armadura para escapar. Após a fuga, ele aprimora sua criação para lutar contra o crime e proteger o mundo como o super-herói Homem de Ferro, enquanto enfrenta inimigos que querem roubar sua tecnologia.",
                        1209686400L, 9,
                        "https://youtu.be/aKkud2sqd1o?si=cSmV4NbhVTgj8My6",
                        Category.FICCAO_CIENTIFICA),
                new Movie("8",
                        "https://ingresso-a.akamaihd.net/b2b/production/uploads/movie/poster/97/vingadores.jpg",
                        "Vingadores: Ultimato",
                        "Os Vingadores se reúnem para enfrentar Thanos em uma última tentativa de salvar o universo.",
                        1183420800L, 7,
                        "https://youtu.be/PgrmbRID0eY?si=5kzOpWQh-zXMYkCX",
                        Category.FICCAO_CIENTIFICA),
                new Movie("9",
                        "https://upload.wikimedia.org/wikipedia/pt/thumb/e/ee/Transformers-poster.jpg/250px-Transformers-poster.jpg",
                        "Transformers",
                        "Uma guerra milenar entre robôs alienígenas, os Autobots e os Decepticons, chega à Terra. Sam Witwicky, um jovem comum, se vê envolvido no conflito quando descobre que é a chave para proteger o planeta e a humanidade da destruição iminente pelas forças dos Decepticons.",
                        1556150400000L, 10,
                        "https://youtu.be/CbX_SIz_9fk?si=wlCgsj3RNiRlf9E7",
                        Category.FICCAO_CIENTIFICA)

        );
    }
    @Override
    public  List<Movie> getMovies(){
        return movies;
    }

    @Override
    public Movie getMovieById(String id) {
       var optionalMovie =  movies.stream().filter(movie -> Objects.equals(movie.id(), id)).findFirst();

       if(optionalMovie.isEmpty()){
           throw new RuntimeException("movie not found");
       }
       return optionalMovie.get();
    }
}
