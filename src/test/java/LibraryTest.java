import org.junit.Before;
import org.junit.Test;


import java.awt.print.Book;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Books book1;
    private Books book2;
    private Books book3;

    private Library library;

    @Before
    public void before(){
        book1 = new Books("Wealth Of Nations", "Adam Smith", "Finance");
        book2 = new Books("Intelligent Investor", "Billy Graham", "Finance");
        book3 = new Books("Think And Grow", "Napoleon Hill", "Self Help");

        ArrayList<Books> booksForTheLibrary = new ArrayList<>();
        booksForTheLibrary.add(book1);
        booksForTheLibrary.add(book2);
        booksForTheLibrary.add(book3);



        library = new Library( booksForTheLibrary );
    }

    @Test
    public void bookHasName(){
        assertEquals("Wealth Of Nations",book1.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Billy Graham", book2.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Self Help", book3.getGenre());
    }

    @Test
    public void canCountBooks(){
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book3);
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void checkTheCapacity(){
        library.addBook(book2);
        library.addBook(book1);
//        library.addBook(book3);
        assertEquals(false, library.checkIfStockFull());
    }

    @Test
    public void addBookToCapacity(){
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book3);
        assertEquals(5, library.getBookCount());
    }

}


