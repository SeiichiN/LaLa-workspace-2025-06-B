package sakuhin;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

// ユーザー入力画面
public class TodoInput {
	
	public static TodoItem input(){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
	System.out.print("番号を入力してください > ");
	int id = scanner.nextInt();
	scanner.nextLine();
	System.out.print("見出しを入力してください  > ");
	String title = scanner.nextLine();
	System.out.print("詳細を入力してください > ");
	String description = scanner.nextLine();
	System.out.print("期日を入力してください (例:2025-06-17) > ");
	String dueTime = scanner.nextLine();
	
	LocalDate duedate;
	try {
		duedate = LocalDate.parse(dueTime);
	} catch(DateTimeParseException e){
		System.out.println("日付はyyyy-MM-ddの形式で入力してください");
		return null;
	}
	// ステータスは仮に「未完了」に固定
	String status = "未完了";

	return new TodoItem
			(id, title, description, duedate, status);
	}
}
