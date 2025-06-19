package AppliCore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Note {
	private String title;
	private String content;
	private List<String> tags;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public Note(String title, String content, List<String> tags) {
	    this.title = title;
	    this.content = content;
	    this.tags = new ArrayList<>(tags); // ✅ リストのコピー
	    this.createdAt = LocalDateTime.now();
	    this.updatedAt = LocalDateTime.now();
	}

	public Note(String title, String content) {
	    this.title = title;
	    this.content = content;
	    this.tags = new ArrayList<>(); // ✅ リスト初期化
	    this.createdAt = LocalDateTime.now();
	    this.updatedAt = LocalDateTime.now();

	}

	public Note(Note other) {
		this.title = other.title;
		this.content = other.content;
		this.tags = new ArrayList<>(other.tags);
		this.createdAt = other.createdAt;
		this.updatedAt = other.updatedAt;
	}
	
	// ノートの内容更新
	public void updateContent(String newContent) {
		this.content = newContent;
		this.updatedAt = LocalDateTime.now();
	}
	
	// ノートタグの管理
	public void addTag(String tag) {
		if (!tags.contains(tag)) {
			tags.add(tag);
		}
	}
	
	public void removeTag(String tag) {
		tags.remove(tag);
	}
	
	// ゲッター
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public List<String> getTags() {
		return tags;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}
