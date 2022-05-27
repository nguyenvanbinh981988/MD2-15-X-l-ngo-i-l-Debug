package Thu_vien_DHKHTN;

import java.util.Date;

public class BorrowCard<E> {
    private String borrowedCardID;
    private Date borrowDate;
    private Date payDate;
    private String bookID;

    public BorrowCard() {
    }

    public BorrowCard(String borrowedCardID, Date borrowDate, Date payDate, String bookID) {
        this.borrowedCardID = borrowedCardID;
        this.borrowDate = borrowDate;
        this.payDate = payDate;
        this.bookID = bookID;
    }

    public String getBorrowedCardID() {
        return borrowedCardID;
    }

    public void setBorrowedCardID(String borrowedCardID) {
        this.borrowedCardID = borrowedCardID;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "BorrowCard{" +
                "borrowedCardID=" + borrowedCardID +
                ", borrowDate=" + borrowDate +
                ", payDate=" + payDate +
                ", bookID='" + bookID + '\'' +
                '}';
    }
}
