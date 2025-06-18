package AppliCore;

import java.util.ArrayList;
import java.util.List;

public class MemoBoxApp {
	private List<Note> notes;
	private List<NoteTab> openTabs;
	private TagManager tagManager;
	private FileManager fileManager;
	private HistoryManager historyManager;
	
	public MemoBoxApp() {
		this.notes = new ArrayList<>();
		this.openTabs = new ArrayList<>();
		this.tagManager = new TagManager();
		this.fileManager = new FileManager();
		this.historyManager = new HistoryManager();
	}
	
	// 新規ノート作成
	public Note createNote(String title, String content, List<String> tags) {
		Note note = new Note(title, content, tags);
		notes.add(note);
		return note;
	}
	
	public Note createNote(String title, String content) {
		Note note = new Note(title, content);
		notes.add(note);
		return note;
	}
	
	// ノートをタブに開く
	public void openNoteInTab(Note note) {
		NoteTab tab = new NoteTab(note);
		openTabs.add(tab);
	}
	
	// ノート一覧取得
	public List<Note> getNotes() {
		return notes;
	}
}