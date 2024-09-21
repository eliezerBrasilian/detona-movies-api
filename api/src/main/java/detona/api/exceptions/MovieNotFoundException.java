package detona.api.exceptions;

public class MovieNotFoundException extends RuntimeException{
     public MovieNotFoundException(){
        super("Movie was not found");
    }
}
