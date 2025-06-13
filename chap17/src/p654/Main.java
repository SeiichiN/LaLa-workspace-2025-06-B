package p654;

public class Main {

	public static void main(String[] args) {
		String flname = "music.mp6";
		try {
			if (flname.endsWith("mp6")) {
				throw new UnsupportedMusicFileException
				  ("未対応のファイルです");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
