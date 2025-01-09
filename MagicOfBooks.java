// POJO for User                                           
class User {
   private String userName;
   private int userId;
   private String email;
   private String password;
   private ArrayList<Book> newBooks;
   private ArrayList<Book> favouriteBooks;
   private ArrayList<Book> completedBooks;        

   public User(String userName, int userId, String email, String password) 
   {
       this.userName = userName;
       this.userId = userId;
       this.email = email;
       this.password = password;
       this.newBooks = new ArrayList<>();
      this.favouriteBooks = new ArrayList<>();
      this.completedBooks = new ArrayList<>();
   }                                                 
    
   public String getUserName() {
       return userName;
   }
 
   public int getUserId() {
       return userId;
   }
 
   public String getEmail() {
       return email;
   }                                                            
   
   public String getPassword() {
       return password;
   }
 
   public ArrayList<Book> getNewBooks() {
       return newBooks;
   }
 
   public ArrayList<Book> getFavouriteBooks() {
       return favouriteBooks;
   }
    public ArrayList<Book> getCompletedBooks() {
       return completedBooks;
   }
 
   public void addNewBook(Book book) {
      newBooks.add(book);
   }
 
   public void addFavouriteBook(Book book) {
       favouriteBooks.add(book);
   }
 
   public void addCompletedBook(Book book) {
      completedBooks.add(book);
   }
}                                                             

// Main Class with functionality
public class MagicOfBooks {                       
    private static Scanner scanner = new Scanner(System.in);
   private static ArrayList<User> users = new ArrayList<>();
 
   public static void main(String[] args) {
       seedData(); // Preload some data
       displayMenu();
   }                                                             private static void seedData() {
       User user1 = new User("Alice", 1, "alice@example.com", "password123");
      user1.addNewBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "A classic novel", 101));
      user1.addFavouriteBook(new Book("1984", "George Orwell", "Dystopian fiction", 102));
      user1.addCompletedBook(new Book("To Kill a Mockingbird", "Harper Lee", "A masterpiece", 103));
 
      users.add(user1);
   }                                                             
   
   private static void displayMenu() {
       while (true) {
          System.out.println("\nWelcome to MagicOfBooks!");
          System.out.println("1. Login");
          System.out.println("2. Exit");
          System.out.print("Choose an option: ");
           int choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline                                                    
          
          switch (choice) {
               case 1:
                  login();
                  break;                                                     case 2:
                  System.out.println("Thank you for using MagicOfBooks! Goodbye!");
                  return;
              default:
                  System.out.println("Invalid choice. Please try again.");
           }
       }
   }
 
   private static void login() {
      System.out.print("Enter username: ");
       String userName = scanner.nextLine();
 
       User user = validateUser(userName);
       if (user != null) {
          System.out.println("Welcome, " + user.getUserName() + "!");
          userMenu(user);
       } else {
          System.out.println("Invalid username. Please try again.");
       }
   }
 
   private static User validateUser(String userName) {
       for (User user : users) {
           if (user.getUserName().equalsIgnoreCase(userName)) {
               return user;
           }
       }
       return null;
   }                                                                 
   
   private static void userMenu(User user) {
       while (true) {
          System.out.println("\nUser Menu");
          System.out.println("1. View Books (New, Favourite, Completed)");
          System.out.println("2. Select a Book by ID");
          System.out.println("3. Logout");
          System.out.print("Choose an option: ");
           int choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline                                                              
          
          switch (choice) {
               case 1:
                  viewBooks(user);
                  break;
               case 2:
                  selectBookById(user);
                  break;
               case 3:
                  System.out.println("Logging out...");
                  return;
              default:
                  System.out.println("Invalid choice. Please try again.");
           }
       }
   }
    private static void viewBooks(User user) {
      System.out.println("\nNew Books:");
       for (Book book : user.getNewBooks()) {
          System.out.println(book);
       }                                                                
       
       System.out.println("\nFavourite Books:");
       for (Book book : user.getFavouriteBooks()) {
          System.out.println(book);
       }
 
      System.out.println("\nCompleted Books:");
       for (Book book : user.getCompletedBooks()) {
           System.out.println(book);
       }
   }                                                             
   
   private static void selectBookById(User user) {
      System.out.print("Enter Book ID: ");
       int bookId = scanner.nextInt();
      scanner.nextLine(); // Consume newline
 
       Book selectedBook = findBookById(user, bookId);
       if (selectedBook != null) {
          System.out.println("\nBook Details:");
          System.out.println("Name: " + selectedBook.getBookName());
          System.out.println("Author: " + selectedBook.getAuthorName());
          System.out.println("Description: " + selectedBook.getDescription());
       } else {
          System.out.println("Book not found with ID " + bookId);
       }
   }                                                                 
   
   private static Book findBookById(User user, int bookId) {
       for (Book book : user.getNewBooks()) {
           if (book.getBookId() == bookId) return book;                                                     }
       for (Book book : user.getFavouriteBooks()) {
           if (book.getBookId() == bookId) return book;
       }
       for (Book book : user.getCompletedBooks()) {
           if (book.getBookId() == bookId) return book;
       }
       return null;
   }
}                                                                
 