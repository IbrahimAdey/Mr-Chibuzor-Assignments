package TestPackage;

import java.util.HashMap;
import java.util.Map;

public class MovieService {
    private Map<String, Movie> movies = new HashMap<>();

    public void addMovie(String name) {
        movies.putIfAbsent(name.toLowerCase(), new Movie(name));
    }

    public void rateMovie(String name, int rating) {
        if (movies.containsKey(name.toLowerCase())) {
            movies.get(name.toLowerCase()).addRating(rating);
        }
    }

    public Movie getMovie(String name) {
        return movies.get(name.toLowerCase());
    }

    public Map<String, Movie> getAllMovies() {
        return movies;
    }
}

