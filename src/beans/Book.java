package beans;

import java.sql.SQLOutput;

public class Book {
    static {
        System.out.println("Book bean class is loading...");
    }

    public Book(){
        System.out.println("Book bean class is instantiating...");
    }
    private int id;
    private String name;
    private String author;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getBookDetails(){
        System.out.println(String.format("%-10s: %s\n%-10s: %d\n%-10s: %s\n%-10s: %.2f\n", "Book Name", this.getName(), "Book ID", this.getId(), "Author", this.getAuthor(), "Price", this.getPrice()));
    }
}
