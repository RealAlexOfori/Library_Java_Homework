import java.util.ArrayList;

public class Library {

    private int capacity = 5 ;

    private ArrayList<Books> books;

    public Library( ArrayList<Books> books){
        this.books = books;
    }

    public int getBookCount(){
        return books.size();
    }

    public void addBook(Books newBook){
        if (checkIfStockFull()) {
            this.books.add(newBook);
        }

    }

    public boolean checkIfStockFull(){
        if(this.books.size() < capacity) {
            return true;

        } ;
        return false;
    }
}
