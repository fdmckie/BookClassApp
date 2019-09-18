public class BookApp {
    public static void main(String[] args) {



        Book b = new Book();
        b.setAuthor("Joel Murach");
        b.setTitle("Murach's Java Programming 5th Edition");
        b.setDescription("Java programming");

        String message = b.displayText();
        System.out.println(message);

        Book b1 = new Book();
        b1.setAuthor("Y. Daniel Laing");
        b1.setTitle("Introduction To Java Programming 10th Edition");
        b1.setDescription("Intro to Java programming");

        String message1 = b1.displayText();
        System.out.println(message1);

    }
}
