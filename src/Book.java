import java.util.Date;

public abstract class Book {
    protected String ISBN;
    protected String Title;
    protected int Years;
    protected double Price;

    public Book(String isbn, String title, int year, double price) {
        this.ISBN = isbn;
        this.Title = title;
        this.Years = year;
        this.Price = price;
    }
    public String getISBN() { return ISBN; }
    public int getYear() { return Years; }
    public double getPrice() { return Price; }


    public abstract void buy(String email, String address, int quantity) throws Exception;
}

