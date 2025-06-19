package example.quiz;

import java.util.Scanner;

public class QuizQuestion {
	// p.472 privateアクセス制御（自分自身のクラスのみアクセス可）
	private String question; //問題文
	private String[] options; //選択肢
	private int correctAnswer; //正しい選択肢のIndex

	//コンストラクタ:問題、選択肢、正しい答えのIndex
	public QuizQuestion(String question, String[]options,
			int correctAnswer) {
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
	
	//問題文取得メソッド
	public String getQuestion() {
		return question;
	}
	
	//選択肢取得メソッド
	public String getOption() {
		return question;
		}
	
	//問題表示メソッド
	public void displayQuestion() {
	        System.out.println(question);
	        for (int i = 0; i < options.length; i++) {
	            System.out.println((i + 1) + ". " + options[i]);
	        }
	        System.out.print("回答を入力してください > ");
	    }
	
	//回答確認メソッド
		public boolean checkAnswer(int userAnswer) {
			//回答(String型)をIndex(0はじまり)に当てはめるため-1とする
			return (userAnswer -1) == correctAnswer;
		}
		
	//正解表示メソッド
		public String getCorrectAnswerText() {
			return options[correctAnswer];
		}

}

