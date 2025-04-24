package org.example;

public class Book extends LibraryItem {

    private final String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book '" + getTitle() + "' has been borrowed.");
        } else {
            throw new IllegalStateException("Book '" + getTitle() + "' is not available.");
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println("Book '" + getTitle() + "' has been returned.");
    }

    public String getAuthor() {return author;}
}
