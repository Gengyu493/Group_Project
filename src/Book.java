public class Book implements BookAbstraction {
    private String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public int getCopies() {
        return copies;
    }

    @Override
    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", Copies: " + copies;
    }
}
