package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("=== 図書館アプリ ===");
        System.out.println ("[コマンド一覧]");
        System.out.println("add…書籍を加える, list…蔵書の一覧を見る,");
        System.out.println("borrow…本を借りる, return…本を返却する,");
        System.out.println("search…蔵書を検索する, exit…アプリを終了する");

        // ユーザーの入力受付
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("アプリを終了します。");
                break;

            } else if (input.startsWith("add")) {
                if (input.length() <= 4) {
                    System.out.println
                    ("[エラー] タイトルと著者を入力してください。例: add \"ライ麦畑でつかまえて\" J.D.サリンジャー");
                    continue;
                }

                String[] parts = input.substring(4).trim().split("\"");

                if (parts.length < 2) {
                    System.out.println
                    ("[エラー] タイトルは \"\" で囲んでください。例: add \"ライ麦畑でつかまえて\" J.D.サリンジャー");
                    continue;
                }

                String title = parts[1].trim();
                String author = parts.length > 2 ? parts[2].trim() : "著者不明";
                library.addBook(title, author);

            } else if (input.equalsIgnoreCase("list")) {
                library.listBooks();

            } else if (input.startsWith("borrow")) {
                try {
                    int index = Integer.parseInt(input.substring(7).trim());
                    library.borrowBook(index);
                } catch (Exception e) {
                    System.out.println("[エラー] borrow の後に本の番号を指定してください。例: borrow 1");
                }

            } else if (input.startsWith("return")) {
                try {
                    int index = Integer.parseInt(input.substring(7).trim());
                    library.returnBook(index);
                } catch (Exception e) {
                    System.out.println("[エラー] return の後に本の番号を指定してください。例: return 1");
                }

            } else if (input.startsWith("search")) {
                String keyword = input.length() > 6 ? input.substring(6).trim() : "";
                library.searchBooks(keyword);

            } else {
                System.out.println
                ("[エラー] 不明なコマンドです。add, list, borrow, return, search, exit を使用してください。");
            }
        }

        scanner.close();
    }
}
