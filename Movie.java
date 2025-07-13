package TestPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private LocalDateTime dateAdded;
    private List<Integer> ratings = new ArrayList<>();

    public Movie(String name) {
        this.name = name;
        this.dateAdded = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }
}

