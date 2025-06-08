package org.example.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*adding books to the list
removing books from the list
returning a list of all books
returning a list of books by Fantasy type
returning a list of books released before 1999
returning the most expensive book
returning the cheapest book
returning a book writted by 3 authors
returning a list of books sorted by parameter: ascending/descending
verifing if a book is on the list
returning a list of books written by provided author*/

public class BookService {
        public BookService(List<Book> bookList) {
                this.bookList = bookList;
        }

        public List<Book> getBookList() {
                return bookList;
        }

        public void setBookList(List<Book> bookList) {
                this.bookList = bookList;
        }




       public  List<Book> bookList=new ArrayList<>();
        
//adding books to the list
public void addBook(Book book){
        bookList.add(book);
}

//removing books from the list
        public void removeBook(Book book){
        bookList.remove(book);
        }

//returning a list of all books
        public void printBookList(){
        for(Book book:bookList){
                System.out.println(book);
        }
        }
        //returning a list of books by Fantasy type
       public List<Book> getBookListByGenre(){
       return bookList.stream().filter(b->b.getGenre().equals("FANTASY")).toList();
       }

       //returning a list of books released before 1999
        public List<Book> getBookListByYearOfPublication(){
        return bookList.stream().filter(b->b.getYearOfPublication()<=2000).toList();
        }

        //returning the most expensive book
        public Book getBookByPrice(){
        return bookList.stream().max((b1,b2)->Double.compare(b1.getPrice(),b2.getPrice())).get();
        }

        //returning the cheapest book
        public Book getBookByPrice2(){
        return bookList.stream().min((b1,b2)->Double.compare(b1.getPrice(),b2.getPrice())).get();
        }

        //returning a book writted by 3 authors


}
