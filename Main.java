import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlogEngine engine = new BlogEngine();

        // Adding some dummy data to simulate the website
        engine.createPost("Getting Started with Java", "Why Java is still relevant today", "Java is a robust, object-oriented programming language used heavily in enterprise backend systems...");
        engine.createPost("The Power of DSA", "How HashMaps save processing time", "A HashMap uses a hashing function to map keys to values, allowing for incredibly fast data retrieval...");

        boolean running = true;

        while (running) {
            System.out.println("\n=== CMD BLOG APPLICATION ===");
            System.out.println("1. View Blog Feed");
            System.out.println("2. Read Full Blog Post");
            System.out.println("3. Write a New Blog");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    engine.displayFeed();
                    break;
                case "2":
                    System.out.print("Enter the ID of the blog you want to read: ");
                    try {
                        int readId = Integer.parseInt(scanner.nextLine());
                        engine.readPost(readId);
                    } catch (NumberFormatException e) {
                        System.out.println("[ERROR] Please enter a valid numerical ID.");
                    }
                    break;
                case "3":
                    System.out.print("Enter Blog Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter a short Snippet: ");
                    String snippet = scanner.nextLine();
                    System.out.print("Enter the full Body: ");
                    String body = scanner.nextLine();
                    engine.createPost(title, snippet, body);
                    break;
                case "4":
                    System.out.println("Shutting down the server...");
                    running = false;
                    break;
                default:
                    System.out.println("[ERROR] Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}