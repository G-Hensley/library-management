package org.example;

public abstract class LibraryItem {

    private final String title;
    private final String id;
    private boolean isAvailable;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitle() {return title;}
    public String getId() {return id;}
    public boolean isAvailable() {return isAvailable;}

    protected void setAvailable(boolean available) {this.isAvailable = available;}

    public abstract void borrowItem();
    public abstract void returnItem();
}
