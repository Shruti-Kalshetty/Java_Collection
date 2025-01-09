import java.util.ArrayList;
import java.util.Scanner;
 
// POJO for Book
class Book {
   private String bookName;
   private String authorName;
   private String description;
   private int bookId;
 
   public Book(String bookName, String authorName, String description, int bookId) {
       this.bookName = bookName;
      this.authorName = authorName;
      this.description = description;
       this.bookId = bookId;
   }
 
   public String getBookName() {
       return bookName;
   }
 
   public String getAuthorName() {
       return authorName;
   }
 
   public String getDescription() {
       return description;
   }
 
   public int getBookId() {
       return bookId;
   }
 
   @Override
   public String toString() {
       return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName;
   }
}
 