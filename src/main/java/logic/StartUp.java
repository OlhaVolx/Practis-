package logic;

import java.util.List;
import java.util.Scanner;

public class StartUp {
    public static BookRepository bookRepository = new BookRepository();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu() {
        System.out.println("***********************");
        System.out.println("        MENU");
        System.out.println("***********************");
        System.out.println("1. List of book");
        System.out.println("2. New book");
        System.out.println("3. Delete book");
        System.out.println("Enter a number");
        int number = in.nextInt();
        if (number == 1) {
            printListOfBook();
        } else if (number == 2) {
            addNewBook();
        } else if (number == 3) {
            deleteBook();
        }

        pressAnyKey();
        printMenu();
    }

    public static void pressAnyKey() {
        System.out.print("Press any key to proceed to menu...");
        in.nextLine();
        in.nextLine();
    }

    public static void printListOfBook() {
        List<Book> books = bookRepository.getBooks();
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).name);
        }
    }

    public static void addNewBook() {
        System.out.println("Please enter the name of book");
        in.nextLine();
        String bookName = in.nextLine();
        System.out.println(bookName);
        bookRepository.addNewBook(new Book(bookName));
    }

    public static void deleteBook() {
        System.out.println("Please enter the number of book for deleting");
        int id = in.nextInt();
        bookRepository.removeBook(id - 1);
    }

}

/* System.out.println("1. Find a book");
         System.out.println("2. Find an author");
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int number = in.nextInt();
         if (number == 1) {
         System.out.println("Please enter a number of book");
         int book = in.nextInt();
         System.out.println("According to your request was found: ");
         if (book == 1) {
         System.out.println(book + " Игра престолов ч.1");
         }
         if (book == 2) {
         System.out.println(book + " Потный Гарик ч.1");
         } else {
         System.out.println("We can not find any book");
         }

         } else if (number == 2) {
         System.out.println("Please enter a number of author");
         int author = in.nextInt();
         System.out.println("According to your request was found: ");
         if (author == 1) {
         System.out.println(author + " Джордж Мартин");
         } else if (author == 2) {
         System.out.println(author + " Джоан Роулинг");
         } else {
         System.out.println("We can not find any author");
         }
         } else {
         System.out.println("Enter valid number");
         }
         }*/





