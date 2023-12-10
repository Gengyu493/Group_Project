public class Book implements BookAbstraction {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;


    }

    @Override
    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author;
    }
}
