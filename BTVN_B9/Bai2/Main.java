package BTVN_B9.Bai2;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement("books.txt", "borrowedBooks.txt");
        // Thêm sách vào thư viện
        Book book1 = new Book("Lập Trình Hướng Đối Tượng", "Vũ Thị Dương", 5);
        Book book2 = new Book("Cấu Trúc Dữ Liệu Và Giải Thuật", "An Văn Minh", 3);
        library.addBook(book1);
        library.addBook(book2);
        // Mượn sách
        library.borrowBook(book1);
        library.borrowBook(book2);
        // Trả sách
        BorrowedBook borrowedBook = library.getBorrowedBooks().get(0);
        library.returnBook(borrowedBook);
        // Hiển thị danh sách sách và thông tin mượn/trả sách
        library.displayBooks();
        library.displayBorrowedBooks();
        // Thống kê
        System.out.println("Số lượng sách đang được mượn: " + library.getTotalBorrowedBooks());
        System.out.println("Số lượng sách đã trả: " + library.getTotalReturnedBooks());
        // Lưu thông tin vào file
        library.saveBooksToFile();
        library.saveBorrowedBooksToFile();
        // Đọc thông tin từ file
        library.loadBooksFromFile();
        library.loadBorrowedBooksFromFile();
    }
}
