package sakuhin;

import java.time.LocalDate;

public class TodoItem {
	private int id;
	private String title;
	private String description;
	private LocalDate dueDate;
	private String status;
	
	public TodoItem(int id, String title, String description,
					LocalDate dueDate, String status){
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.status = status;
	}
	
	// getterの生成
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public String getStatus() {
		return status;
	}
	
	// setterの生成
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
