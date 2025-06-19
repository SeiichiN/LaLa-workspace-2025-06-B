package sakuhin;
//入力内容を表示する

import java.util.List;

public class TodoPrint {
	public static void printAll(List<TodoItem> items) {
		for(TodoItem item : items) {
			System.out.println("ID : " + item.getId());
			System.out.println("タイトル : " + item.getTitle());
			System.out.println("詳細 : " + item.getDescription());
			System.out.println("期限 : " + item.getDueDate());
			System.out.println("状態 : " + item.getStatus());
		}
	}

}
