package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizManager {
	List<Quiz> quizList = new ArrayList<>();
	
	public void printQuestion(int i) {
		System.out.println(quizList.get(i).question);
	}
	
	public int choice(int n) {
		List<String> selection = quizList.get(n).selection;
		for (int i = 0; i < selection.size(); i++) {
			System.out.println(i + ":" + selection.get(i));
		}
		System.out.print("正しいのはどれ？ > ");
		int selectNum = new Scanner(System.in).nextInt();
		return selectNum;
	}
	
	public boolean isRight(int i, int userAns) {
		int ans = quizList.get(i).answer;
		if (userAns == ans) {
			return true;
		}
		return false;
	}

	
	public void setup() {
		Quiz q = new Quiz();
		q.question = "日本の首都はどこですか？";
		q.selection.add("大阪");
		q.selection.add("京都");
		q.selection.add("東京");
		q.selection.add("名古屋");
		q.answer = 2;
		quizList.add(q);
		
		q = new Quiz();
		q.question = "富士山の高さは約何メートル？";
		q.selection.add("3776m");
		q.selection.add("2999m");
		q.selection.add("4080m");
		q.selection.add("1500m");
		q.answer = 0;
		quizList.add(q);
		
		q = new Quiz();
		q.question = "日本の通貨単位は？";
		q.selection.add("ドル");
		q.selection.add("ユーロ");
		q.selection.add("円");
		q.selection.add("ウォン");
		q.answer = 2;
		quizList.add(q);
	}
}
