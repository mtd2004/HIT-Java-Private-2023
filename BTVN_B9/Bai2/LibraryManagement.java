package BTVN_B9.Bai2;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<Book> books;
    private List<BorrowedBook> borrowedBooks;
    private String booksFile;
    private String borrowedBooksFile;

    public LibraryManagement(String booksFile, String borrowedBooksFile) {
        this.booksFile = booksFile;
        this.borrowedBooksFile = borrowedBooksFile;
        books = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book) {
        try {
            if (book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                LocalDate borrowDate = LocalDate.now();
                LocalDate returnDate = borrowDate.plusWeeks(2);
                BorrowedBook borrowedBook = new BorrowedBook(book, borrowDate, returnDate);
                borrowedBooks.add(borrowedBook);
                System.out.println("Bạn đã mượn sách \"" + book.getTitle() + "\" thành công.");
            } else {
                System.out.println("Xin lỗi, không còn sách \"" + book.getTitle() + "\" trong thư viện.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void returnBook(BorrowedBook borrowedBook) {
        Book book = borrowedBook.getBook();
        book.setQuantity(book.getQuantity() + 1);
        borrowedBooks.remove(borrowedBook);
        System.out.println("Bạn đã trả sách \"" + book.getTitle() + "\" thành công.");
    }

    public void saveBooksToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(booksFile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(books);
            objectOut.close();
            fileOut.close();
            System.out.println("Danh sách sách đã được ghi vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể ghi vào file " + booksFile);
        }
    }

    public void loadBooksFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(booksFile);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            books = (List<Book>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Danh sách sách đã được đọc từ file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể đọc từ file " + booksFile);
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Lớp Book không tìm thấy.");
        }
    }

    public void saveBorrowedBooksToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(borrowedBooksFile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(borrowedBooks);
            objectOut.close();
            fileOut.close();
            System.out.println("Danh sách thông tin mượn/trả sách đã được ghi vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể ghi vào file " + borrowedBooksFile);
        }
    }

    public void loadBorrowedBooksFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(borrowedBooksFile);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            borrowedBooks = (List<BorrowedBook>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Danh sách thông tinmượn/trả sách đã được đọc từ file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể đọc từ file " + borrowedBooksFile);
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Lớp BorrowedBook không tìm thấy.");
        }
    }

    public void displayBooks() {
        System.out.println("Danh sách sách trong thư viện:");
        for (Book book : books) {
            System.out.println("Tên sách: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Số lượng còn lại: " + book.getQuantity());
            System.out.println("------------------------------------");
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Danh sách thông tin mượn/trả sách:");
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println("Tên sách: " + borrowedBook.getBook().getTitle());
            System.out.println("Tác giả: " + borrowedBook.getBook().getAuthor());
            System.out.println("Ngày mượn: " + borrowedBook.getBorrowDate());
            System.out.println("Ngày trả: " + borrowedBook.getReturnDate());
            System.out.println("------------------------------------");
        }
    }

    public int getTotalBorrowedBooks() {
        return borrowedBooks.size();
    }

    public int getTotalReturnedBooks() {
        int totalReturnedBooks = 0;
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getReturnDate().isBefore(LocalDate.now())) {
                totalReturnedBooks++;
            }
        }
        return totalReturnedBooks;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }
}
