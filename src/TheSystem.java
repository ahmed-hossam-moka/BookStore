public class TheSystem {
    private Inventory inventory;

    public TheSystem() {
        inventory = new Inventory();
    }

    public void addBook(Book book) {
        inventory.addBook(book);
    }

    public void delExpier(int maxYearsOld, int currentYear) {
        inventory.delExpier(maxYearsOld, currentYear);;

    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book book = inventory.getBook(isbn);
        if (book == null) {
            throw new Exception("Not Found");
        }
        book.buy(email, address, quantity);
        return book.getPrice() * quantity;
    }
}

