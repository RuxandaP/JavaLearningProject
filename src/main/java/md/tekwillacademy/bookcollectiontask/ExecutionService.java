package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {

        Book mihaisBook = new Book("Atomic Habits", "James C");
        Book alexsBook = new Book("Crime and Punishment", "F.Dostoievski");
        Book ruxandasBook = new Book("Karamazov Brother", "F. Dostoievski");
        Book veronicasBook = new Book("How to kill a Mockingbird", "H.Lee");
        Book mihais2Book = new Book("1984", "G.Orwell");

        mihais2Book.printTheBookDetails();
        mihaisBook.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.deleABookIfExists(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");

        victorsLibrary.addBook(alexsBook);
        victorsLibrary.addBook(ruxandasBook);
        victorsLibrary.addBook(veronicasBook);
        System.out.println(victorsLibrary.getTheStockStatusNumber());
        victorsLibrary.printAllTheBooks();

        Map<String,Library> librarysMap = new HashMap<>();

        librarysMap.put("Str. Stefan cel Mare 136", carturestiLibrary);
        librarysMap.put("Str. Dacia 24/3", victorsLibrary);

        librarysMap.get("Str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librarysMap.get("Str. Dacia 24/3").isThereSuchABookInTheStock(veronicasBook));

        int[] dataTable = new int [6];
        dataTable[0] = 9;
        dataTable[1] = 65;
        dataTable[2] = 12;
        dataTable[3] = 52;
        dataTable[4] = 5;
        dataTable[5] = 1;

        System.out.println(IntNumberArrayService.findMin(dataTable));

        System.out.println(IntNumberArrayService.getAvg(dataTable));

        int[] dataTableShort = {3,5,55,89,45,26,45,4};

        System.out.println(IntNumberArrayService.findMin(dataTableShort));

        System.out.println(IntNumberArrayService.getAvg(dataTableShort));

    }
}
