package app;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 問題と正解の配列
        String[] questions = {
            "日本の首都はどこですか？",
            "富士山の高さは約何メートル？",
            "日本の通貨単位は？"
        };

        String[][] choices = {
            {"1. 大阪", "2. 京都", "3. 東京", "4. 名古屋"},
            {"1. 3776m", "2. 2999m", "3. 4080m", "4. 1500m"},
            {"1. ドル", "2. ユーロ", "3. 円", "4. ウォン"}
        };

        int[] correctAnswers = {3, 1, 3}; // 正解の番号（1〜4）

        boolean playAgain = true;

        while (playAgain) {
            int score = 0;

            System.out.println("=== クイズゲームを始めます！ ===\n");

            // 各問題を出題
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Q" + (i + 1) + ": " + questions[i]);

                // 選択肢を表示
                for (String choice : choices[i]) {
                    System.out.println(choice);
                }

                // 入力受付
                System.out.print("答えを数字で入力してください（1〜4）: ");
                int userAnswer = scanner.nextInt();

                // 正誤判定
                if (userAnswer == correctAnswers[i]) {
                    System.out.println("正解！\n");
                    score++;
                } else {
                    System.out.println("不正解！正解は " + choices[i][correctAnswers[i] - 1] + " です。\n");
                }
            }

            // スコアを表示
            System.out.println("=== 結果発表 ===");
            System.out.println("あなたのスコア: " + score + " / " + questions.length + "\n");

            // 繰り返しプレイするか？
            System.out.print("もう一度プレイしますか？（はい：1 / いいえ：0）: ");
            int again = scanner.nextInt();
            playAgain = (again == 1);
            System.out.println();
        }

        System.out.println("ゲームを終了します。お疲れ様でした！");
        scanner.close();
    

	}

}
