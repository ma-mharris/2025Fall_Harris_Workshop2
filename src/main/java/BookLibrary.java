import org.excample.Book;

import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Book list
        Book[] books = {
                new Book(1, "978-0310205715", "The Purpose Driven Life - Rick Warren"),
                new Book(2, "978-0446691093", "Battlefield of the Mind - Joyce Meyer"),
                new Book(3, "978-0060652920", "Mere Christianity - C.S. Lewis"),
                new Book(4, "978-1612680194", "Rich Dad Poor Dad - Robert Kiyosaki"),
                new Book(5, "978-0785289081", "The Total Money Makeover - Dave Ramsey"),
                new Book(6, "978-0449214923", "Think and Grow Rich - Napoleon Hill"),
                new Book(7, "978-0345472328", "Mindset - Carol S. Dweck"),
                new Book(8, "978-0143127550", "Grit - Angela Duckworth"),
                new Book(9, "978-0802412706", "The 5 Love Languages - Gary Chapman"),
                new Book(10, "978-0310337370", "Sacred Marriage - Gary Thomas"),
                new Book(11, "978-1433551932", "Parenting - Paul David Tripp"),
                new Book(12, "978-1591846444", "Start with Why - Simon Sinek"),
                new Book(13, "978-0066620992", "Good to Great - Jim Collins"),
                new Book(14, "978-0743269513", "The 7 Habits of Highly Effective People - Stephen R. Covey"),
                new Book(15, "978-1591848011", "Leaders Eat Last - Simon Sinek"),
                new Book(16, "978-1501111112", "The Millionaire Next Door - Thomas J. Stanley"),
                new Book(17, "978-0735211292", "Atomic Habits - James Clear"),
                new Book(18, "978-1591451877", "Love and Respect - Emerson Eggerichs"),
                new Book(19, "978-0671027032", "How to Win Friends and Influence People - Dale Carnegie"),
                new Book(20, "978-0736957373", "The Power of a Praying Husband - Stormie Omartian")
        };

        boolean exit = false;

        while (!exit) {
            System.out.println("1. List of Books in Library:\n");

            System.out.println("2. List of Checked Out Books:\n");
            System.out.println("3. Exit");
            String choices = scanner.nextLine();

            //String C = checkout;
            // String X = homeScreen;

            switch (choices) {
                case "1":
                    bookList(scanner, books);
                    break;
                case "2":
                    checkedOut(scanner, books);
                    break;
                case "3":
                    exit = false;
                    System.out.println("Exit Application.....Goodbye!");
                    break;
            }

        }

        scanner.close();

    }


    private static void bookList(Scanner scanner, Book[] books) {
        System.out.println("List of available Books:\n" );
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("Book ID: " + book.getId() + book.getIsbn() + book.getTitle());
            }
        }
            System.out.println("Select a book to check out: ");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter the ID of the book you want to check out: ");
            int id = scanner.nextInt();
            //Scanner scanner2 = new Scanner(System.in);

            if(id !=0){
            System.out.println("Please enter your full name to check out a book: ");
            String name = scanner.nextLine();
            if(name != ""){
                System.out.println("Book Checked Out: ");
                return;

            };
                System.out.println("Please select a book to check out: " );
            }
        }

    private static void checkedOut(Scanner scanner , Book[] books) {

        for(Book book : books){
         if(book.isCheckedOut()){
            System.out.println("Book ID: " + book.getId() + book.getIsbn() + book.getTitle());
        }
    }
}


    }




        // Book book1 = new Book(id, isbn, title, isCheckedOut, checkedOutTo);
        // System.out.println("Book 1: " + book1);

    //for(Book book : library){
    //  System.out.println(book.getBook());
