public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year) {
        super(isbn, title, year, 0.0);
    }

    @Override
    public void buy(String email, String address, int quantity) throws Exception {
        System.out.println("\n=======================");
        System.out.println("= Buying ShowcaseBook =");
        System.out.println("=======================");
        throw new Exception("Not for sale!");

    }
}