package app;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		QuizManager quizManager = new QuizManager();
		quizManager.setup();
		
		int score = 0;
		List<Quiz> quizList = quizManager.quizList;
		for (int i = 0; i < quizList.size(); i++) {
			quizManager.printQuestion(i);
			int num = quizManager.choice(i);
			if (quizManager.isRight(i, num)) {
				score++;
			}

		}
		System.out.println("正解数：" + score);
	}

}
