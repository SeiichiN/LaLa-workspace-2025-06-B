package AppliCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TagManager {
	private Map<String, List<Note>> tagIndex;
	
	public TagManager() {
		this.tagIndex = new HashMap<>();
	}
	
	// タグをノートに追加
	public void addTag(Note note, String tag) {
		note.addTag(tag);
		tagIndex.computeIfAbsent(tag, k -> new ArrayList<>()).add(note);
	}
	
	// ノートからタグ削除
	public void removeTag(Note note, String tag) {
		note.removeTag(tag);
		if (tagIndex.containsKey(tag)) {
			tagIndex.get(tag).remove(note);
			if (tagIndex.get(tag).isEmpty()) {
				tagIndex.remove(tag);
			}
		}
	}
	
	// タグで検索
	public List<Note> filterByTag(String tag) {
		return tagIndex.getOrDefault(tag, Collections.emptyList());
	}
	
	// 全タグリスト取得
	public Set<String> getAllTags() {
		return tagIndex.keySet();
	}
}
