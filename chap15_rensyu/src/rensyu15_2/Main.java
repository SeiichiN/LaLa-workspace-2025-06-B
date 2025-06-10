package rensyu15_2;

public class Main {

	public static void main(String[] args) {
	    // String folder = "c:\\javadev";
	    String folder = "c:\\user\\";
	    String file = "readme.txt";
	  	String path = make(folder, file);
	  	System.out.println(path);
	}
	
	public static String make(String folder, String file) {
		String s = "";
		if (folder.endsWith("\\")) {
			s = folder + file;
		} else {
			s = folder + "\\" + file;
		}
		return s;
	}
}
