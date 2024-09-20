package detona.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Movie(String id,
                    String picture,
                    String title, String description,
                    @JsonProperty("release_date")
                    Long releaseDate,
                    int rating,
                    String trailer,
                    Categoria categoria
){ }
