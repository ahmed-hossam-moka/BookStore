public class Ebook extends Book implements iMailService {
    private String fileType;
    private int stock;

    public Ebook(String isbn, String title, int year, double price, int stock, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
        this.stock=stock;

    }
    @Override
    public void buy( String email, String address, int quantity) throws Exception {

        if (stock < quantity) {
            System.out.println("\n=======================");
            System.out.println("=  Buying PaperBook   =");
            System.out.println("=======================");
            throw new Exception("The stock quantity is not enough");
        }
        stock -= quantity;

        System.out.println("\n=======================");
        System.out.println("=    Buying EBook     =");
        System.out.println("=======================");
        System.out.println("Done and the total price is " + (Price*quantity)+"$");
        System.out.println(sendMail()+email);
    }
    @Override
    public String sendMail() {  return "Sending eBook to the email "; }
}
