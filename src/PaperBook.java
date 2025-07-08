public class PaperBook extends Book implements iShippingService {
    private int stock;

    public PaperBook(String isbn, String title , int year, double price, int stock) {
        super(isbn, title, year, price);
        this.stock = stock;
    }

    @Override
    public void buy(String email, String address,int quantity) throws Exception {
        if (stock < quantity) {
            System.out.println("\n=======================");
            System.out.println("=  Buying PaperBook   =");
            System.out.println("=======================");
            throw new Exception("The stock quantity is not enough");
        }
        stock -= quantity;

        System.out.println("\n=======================");
        System.out.println("=  Buying PaperBook   =");
        System.out.println("=======================");
        System.out.println("Done and the total price is " + (Price * quantity)+"$");
        System.out.println(shippingBook() + address);
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String shippingBook() { return "The Book is Shipping to address ";}
}
