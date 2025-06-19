package AppliCore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class FileManager {
	private static final String JSON_PATH = "notes.json";
	private static final String TEXT_PATH = "notes.text";
	private static final String CSV_PATH = "notes.csv";
	private static final String PDF_PATH = "notes.pdf";
	private static final String HTML_PATH = "notes.html";
	private ObjectMapper objectMapper;

	public FileManager() {
		this.objectMapper = new ObjectMapper();
	}

	// JSON形式で保存
	public void saveAsJson(List<Note> notes) {
		try {
			objectMapper.writeValue(new File(JSON_PATH), notes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// TXTファイルで保存
	public void saveAsText(List<Note> notes) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_PATH))) {
			for (Note note : notes) {
				writer.write("タイトル:" + note.getTitle());
				writer.newLine();
				writer.write("コンテンツ:" + note.getContent());
				writer.newLine();
				writer.write("タグ:" + String.join(",", note.getTags()));
				writer.newLine();
				writer.write("----------------------");
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// CSV形式で保存
	public void saveAsCsv(List<Note> notes) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_PATH))) {
			writer.write("タイトル,コンテンツ,タグ");
			writer.newLine();
			for (Note note : notes) {
				writer.write(note.getTitle() + "," + note.getContent() +
						"," + String.join("|", note.getTags()));
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//PDF形式で保存
	public void savaAsPdf(List<Note> notes) {
		try {
			PdfWriter writer = new PdfWriter(new FileOutputStream(PDF_PATH));
			PdfDocument pdf = new PdfDocument(writer);
			Document document = new Document(pdf); // ✅ 修正
			for (Note note : notes) {
				document.add(new Paragraph("タイトル:" + note.getTitle()));
				document.add(new Paragraph("コンテンツ:" + String.join(",", note.getTags())));
				document.add(new Paragraph("タグ:" + note.getTitle()));
				document.add(new Paragraph("----------------------"));
			}
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// HTML形式で保存
	public void saveAsHtml(List<Note> notes) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(HTML_PATH))) {
			writer.write("<html><body>");
			for (Note note : notes) {
				writer.write("<h2>" + note.getTitle() + "</h2>");
				writer.write("<p>" + note.getContent() + "</p>");
				writer.write("<p><b>Tags:</b>" + String.join(",", note.getTags()) + "</p>");
				writer.write("<hr>");
			}
			writer.write("</body></html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
