package test;

import AppliCore.MemoBoxApp;
import AppliCore.Note;

public class MakeNoteTest {

	public static void main(String[] args) {
		MemoBoxApp app = new MemoBoxApp();
		Note note1 = app.createNote(
				"初めてのノート",
				"初めてノートを書きました。"				);
	}

}
