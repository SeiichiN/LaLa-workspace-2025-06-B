package app;

import java.util.ArrayList;
import java.util.List;

// 蔵書をリストで管理
public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // 本の追加
    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("[追加] " + newBook);
    }

    // 一覧を表示
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("[情報] 登録されている本はありません。");
            return;
        }
        System.out.println("【蔵書一覧】");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ": " + books.get(i));
        }
    }

    // 借りる
    public void borrowBook(int index) {
        if (!isValidIndex(index)) return;

        Book book = books.get(index);
        if (book.isBorrowed()) {
            System.out.println("[注意] この本はすでに貸し出されています。");
        } else {
            book.borrow();
            System.out.println("[貸出] \"" + book.getTitle() + "\" を貸し出しました。");
        }
    }

    // 返却
    public void returnBook(int index) {
        if (!isValidIndex(index)) return;

        Book book = books.get(index);
        if (!book.isBorrowed()) {
            System.out.println("[注意] この本はまだ貸し出されていません。");
        } else {
            book.returnBook();
            System.out.println("[返却] \"" + book.getTitle() + "\" を返却しました。");
        }
    }

    // 本を検索
    public void searchBooks(String keyword) {
        if (keyword.isEmpty()) {
            System.out.println("[エラー] 検索キーワードを入力してください。");
            return;
        }

        System.out.println("【検索結果】\"" + keyword + "\" を含む本：");
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getTitle().contains(keyword) || b.getAuthor().contains(keyword)) {
                System.out.println(i + ": " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("[情報] 該当する本は見つかりませんでした。");
        }
    }

   
    private boolean isValidIndex(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("[エラー] 指定された番号の本は存在しません。");
            return false;
        }
        return true;
    }
}
