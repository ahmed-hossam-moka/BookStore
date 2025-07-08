public class Main {
    public static void main(String[] args) {
        TheSystem store = new TheSystem();

        store.addBook(new PaperBook("1","c# Basics", 2010, 200, 50));
        store.addBook(new PaperBook("2","java OOP", 2009, 300, 50));
        store.addBook(new Ebook("3", "Grokking algorithm", 2019, 25.0, 5,"PDF"));
        store.addBook(new ShowcaseBook("4", "beta Software Engineering", 2025));

        try {
            store.buyBook("3", 1, "ahmed1@gmail.com", "Cairo");
        } catch (Exception e) { System.out.println(e.getMessage());}

        try {
            store.buyBook("1", 2, "ahmed2@example.com", "Giza");
        } catch (Exception e) { System.out.println(e.getMessage());}

        try {
            store.buyBook("1", 100, "ahmed5@example.com", "Giza");
        } catch (Exception e) { System.out.println(e.getMessage());}

        try {
            store.buyBook("4", 1, "ahmed3@example.com", "Cairo");
        } catch (Exception e) { System.out.println(e.getMessage());}

        System.out.println("\n=================================================");
        System.out.println("= Removing outdated books (older than 10 years) =");
        System.out.println("=================================================");
        store.delExpier(10, 2025);
    }
}


