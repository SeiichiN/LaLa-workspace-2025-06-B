package AppliCore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class HistoryManager {
	private Map<String, LinkedList<Note>> historyMap;
	private static final int MAX_HISTORY = 100;
	
	public HistoryManager() {
		this.historyMap = new HashMap<>();
	}
	
	// 履歴の保存
	
	public void saveHistory(String noteId, Note note) {
		historyMap.putIfAbsent(noteId, new LinkedList<>());
		LinkedList<Note> history = historyMap.get(noteId);
		
		// 履歴のデータが超えたら古いデータを削除
		if (history.size() >= MAX_HISTORY) {
			history.removeFirst();
		}
		history.add(new Note(note));
	}
	
	// 履歴一覧を取得
	public List<Note> getHistory(String noteId) {
		return historyMap.getOrDefault(noteId, new LinkedList<>());
	}
	
	// 特定のバージョン復元
	public Note restoreVersion(String noteId, int versionIndex) {
		LinkedList<Note>history = historyMap.get(noteId);
		if (history != null && versionIndex >= 0 && versionIndex < history.size()) {
			return new Note(history.get(versionIndex)); // 指定のバージョンを復元
		}
		return null;
	}
	// 履歴のクリア
	public void clearHistory(String noteId) {
		historyMap.remove(noteId);
	}
}
