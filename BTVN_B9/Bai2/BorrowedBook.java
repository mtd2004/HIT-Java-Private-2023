package BTVN_B9.Bai2;

import java.io.Serializable;
import java.time.LocalDate;

public class BorrowedBook implements Serializable {
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowedBook(Book book, LocalDate borrowDate, LocalDate returnDate) throws Exception{
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        if(this.returnDate.compareTo(this.borrowDate) < 0) {
            throw new Exception("Lỗi : Ngày mượn và ngày trả sách không hợp lệ") ;
        }
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
