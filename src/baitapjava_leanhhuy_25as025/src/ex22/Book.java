package ex22;

public class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty;

    public Book(String n, Author[] a, double p) {
        name = n;
        authors = a;
        price = p;
    }
    public Book(String n, Author[] a, double p, int q) {
        name = n;
        authors = a;
        price = p;
        qty = q;
    }
    public String getName(){
        return name;
    }
    public Author getAuthors[]{

    }
}
