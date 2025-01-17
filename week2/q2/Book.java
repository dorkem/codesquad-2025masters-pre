package week2.q2;

import java.util.ArrayList;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public static ArrayList<Book> initBooks(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("태백산맥", "조정래"));
        books.add(new Book("이기적 유전자", "리처드 도킨스"));
        books.add(new Book("자전거 도둑", "박완서"));
        books.add(new Book("토지", "박경리"));
        books.add(new Book("대변동", "제레드 다이아몬드"));
        return books;
    }

    public static ArrayList<Book> deepCopy(ArrayList<Book> base){
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : base) {
            books.add(new Book(book.bookName, book.author));
        }
        return books;
    }

    public static void printBooks(ArrayList<Book> books, String library) {
        System.out.println("도서관" + library + "의 책 목록:");
        for (Book book : books) {
            System.out.println("제목: " + book.getBookName() + ", 저자: " + book.getAuthor());
        }
        System.out.println();
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}
