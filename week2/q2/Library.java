package week2.q2;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> A = Book.initBooks();
        ArrayList<Book> A1 = A;
        ArrayList<Book> B = Book.deepCopy(A);

        A.set(2, new Book("그 많던 싱아는 누가 다 먹었을까?","박완서"));
        B.add(new Book("사피엔스","유발 하라리"));

        Book.printBooks(A, "A");
        Book.printBooks(A1, "A-1");
        Book.printBooks(B,"B");
    }
}
