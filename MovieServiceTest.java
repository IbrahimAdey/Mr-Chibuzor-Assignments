package TestPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    @Test
    void testAddMovieAndRetrieve() {
        MovieService service = new MovieService();
        service.addMovie("Koto Aiye");
        assertNotNull(service.getMovie("Koto Aiye"));
    }

    @Test
    void testRatingMovie() {
        MovieService service = new MovieService();
        service.addMovie("Ipadabo Abija");
        service.rateMovie("Ipadabo Abija", 5);
        assertEquals(5.0, service.getMovie("Ipadabo Abija").getAverageRating());
    }

    @Test
    void testAverageRatingMultiple() {
        MovieService service = new MovieService();
        service.addMovie("Matrix");
        service.rateMovie("Matrix", 4);
        service.rateMovie("Matrix", 2);
        assertEquals(3.0, service.getMovie("Matrix").getAverageRating());
    }
}
