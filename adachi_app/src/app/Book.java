package app;

// 本の情報(タイトル、著者、貸出情報)を持つクラス

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;  // 貸出中であればfalse
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + " - " + author + (isBorrowed ? "（貸出中）" : "（未貸出）");
    }
}
