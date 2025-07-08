import java.util.*;

public class Inventory {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("This " + book.Title+" was added");
    }
    public Book getBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    public void delExpier(int expyear, int currYear) {
        for (int i = 0; i < books.size(); ) {
            Book book = books.get(i);
            if (currYear - book.getYear() > expyear) {
                books.remove(i);
                System.out.println(book.Title+ " deleted because is expired :( ");
            } else {
                i++;
            }
        }
    }

}
