package example.quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// スコア初期化
		int score = 0; 
		
		System.out.println("===!!!Quiz Start!!!===");
		System.out.println();
		// Question1
		// 参考: https://www.mofa.go.jp/mofaj/kids/ranking/jinko_s.html
		// バチカン(615) クック諸島(17,000) リヒテ(39,000)
		String[] option1 = {"クック諸島", "リヒテンシュタイン", "バチカン"};
		QuizQuestion q1 = new QuizQuestion
				("Q1. 世界で最も人口の少ない国は？" ,option1, 2); // Index 0はじまり
				
		// Answer Check1
		// 問題表示
		q1.displayQuestion();
		// ユーザー回答読み込み
		int userAnswer = scanner.nextInt();
		if (q1.checkAnswer(userAnswer)) {
			System.out.println("【正解!】");
			score++;
		} else {
			System.out.println
			("残念!不正解!" + "正解は:【" + q1.getCorrectAnswerText() + "】です。" );
		}
		System.out.println();
		
	    // Question2
		// 参考: https://www.mofa.go.jp/mofaj/kids/ranking/sheep.html
		// トルコ(45,178) 中国(186,377) イギリス(32,957)
		String[] option2 = {"トルコ", "中国", "イギリス"};
		QuizQuestion q2 = new QuizQuestion
				("Q2. 羊の頭数が最も多い国は？", option2, 1);
		
		// Answer Check2
		q2.displayQuestion(); 
		userAnswer = scanner.nextInt();
		if (q2.checkAnswer(userAnswer)) {
			System.out.println("【正解!】");
			score++;
		} else {
			System.out.println
			("残念!不正解!" + "正解は:【"  + q2.getCorrectAnswerText() + "】です。" );
		}
		System.out.println();
		
		//Question3
		//参考:https://www.mofa.go.jp/mofaj/kids/ranking/isan.html 
		//イタリア(59)　フランス(52)　日本(25)
		String[] option3 = {"イタリア", "エジプト", "日本"};
		QuizQuestion q3 = new QuizQuestion
				("Q3. 世界遺産の多い国は？", option3, 0);
		
		// Answer Check3
		q3.displayQuestion();
		userAnswer = scanner.nextInt();
		if(q3.checkAnswer(userAnswer)) {
			System.out.println("【正解!】");
			score++;
		} else {
			System.out.println
			("残念!不正解!" + "正解は:【"  + q3.getCorrectAnswerText() + "】です。");
		}
		System.out.println();
		
		//Question4
		//参考: https://www.ragnet.co.jp/earth-trivia/3
		//A. 5時間
		String[] option4 = {"5時間", "120時間", "48時間"};
		QuizQuestion q4 = new QuizQuestion
				("Q4. 地球が誕生した頃、1日は何時間でしたでしょう？", option4, 0);
		
		//Answer Check4
		q4.displayQuestion();
		userAnswer = scanner.nextInt();
		if(q4.checkAnswer(userAnswer)) {
			System.out.println("【正解】");
			score++;
		} else {
			System.out.println
			("残念!不正解!" + "正解は:【"  + q4.getCorrectAnswerText() + "】です。");
		}
		System.out.println();
		
		//Question5
		//参考：https://www.ragnet.co.jp/space-trivia/3
		//A. 360
		String[] option5 = {"180km", "200km", "360km"};
		QuizQuestion q5 = new QuizQuestion
				("Q5. 金星では、【スーパーローテーション』と呼ばれる猛スピードの風が吹いています。"
						+ "\nこの風の時速は何キロでしょう？", option5, 2);
		
		//Answer Check5
		q5.displayQuestion();
		userAnswer = scanner.nextInt();
		if(q5.checkAnswer(userAnswer)) {
			System.out.println("【正解】");
			score++;
		} else {
			System.out.println
			("残念!不正解!" + "正解は:【"  + q4.getCorrectAnswerText() + "】です。");
		}
		System.out.println();
		
		System.out.println("===!!!Quiz Over!!!===");
		System.out.println("あなたの最終スコア: 【" + score + "点】です！");
        if (score == 5) {
        	System.out.println("");
        }
		
		
		//スキャナー閉じる
		scanner.close();
		
	} // main method end
} // Main Class End
