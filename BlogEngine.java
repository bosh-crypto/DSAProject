// Use of linked list and Hashtables
import java.util.HashMap;
import java.util.LinkedList;

class BlogEngine {
    private LinkedList<BlogPost> feed;
    private HashMap<Integer, BlogPost> database;
    private int idCounter;

    public BlogEngine() {
        feed = new LinkedList<>();
        database = new HashMap<>();
        idCounter = 1; // Auto-increments for each new post
    }

    // O(1) Insertion
    public void createPost(String title, String snippet, String body) {
        BlogPost newPost = new BlogPost(idCounter, title, snippet, body);
        
        // Add to the front of the feed (newest first)
        feed.addFirst(newPost);
        
        // Add to the HashMap for instant ID lookups
        database.put(idCounter, newPost);
        
        System.out.println("\n[SUCCESS] Blog published with ID: " + idCounter);
        idCounter++;
    }

    // O(n) Iteration for the feed
    public void displayFeed() {
        if (feed.isEmpty()) {
            System.out.println("\nThe feed is empty. Write something!");
            return;
        }
        System.out.println("\n--- LATEST BLOGS ---");
        for (BlogPost post : feed) {
            post.printSnippet();
        }
    }

    // O(1) Retrieval
    public void readPost(int id) {
        if (database.containsKey(id)) {
            database.get(id).printFullPost();
        } else {
            System.out.println("\n[ERROR] Blog with ID " + id + " not found.");
        }
    }
}