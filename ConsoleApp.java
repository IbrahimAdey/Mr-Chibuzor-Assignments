package TestPackage;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieService service = new MovieService();
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add a Movie\n2. Rate a Movie\n3. View Average Ratings\n4. Exit\nEnter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the movie name: ");
                    String name = scanner.nextLine();
                    service.addMovie(name);
                    System.out.println("Movie '" + name + "' added!");
                }
                case 2 -> {
                    System.out.print("Enter the movie name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your rating (1-5): ");
                    int rating = Integer.parseInt(scanner.nextLine());
                    service.rateMovie(name, rating);
                    System.out.println("Rating added for '" + name + "': " + rating);
                }
                case 3 -> {
                    System.out.println("Average Ratings:");
                    service.getAllMovies().forEach((key, movie) ->
                            System.out.printf("- %s: %.2f\n", movie.getName(), movie.getAverageRating()));
                }
                case 4 -> {
                    System.out.println("Exiting the application. Goodbye!");
                    running = false;
                }
            }
        }
    }
}

