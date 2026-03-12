// Encaptulation Used by groupping all the datatypes 
class BlogPost {
    int id;
    String title;
    String snippet;
    String body;
    // Constructor for memory allocation with structure 
    public BlogPost(int id, String title, String snippet, String body) {
        this.id = id;
        this.title = title;
        this.snippet = snippet;
        this.body = body;
    }

    // Displays the short version for the feed / blog
    public void printSnippet() {
        System.out.println("\n[" + id + "] " + title);
        System.out.println("Snippet: " + snippet + "...");
        System.out.println("------------------------------------------------");
    }

    // Displays the full article
    public void printFullPost() {
        System.out.println("\n========== " + title.toUpperCase() + " ==========");
        System.out.println(body);
        System.out.println("=============================================\n");
    }
}
