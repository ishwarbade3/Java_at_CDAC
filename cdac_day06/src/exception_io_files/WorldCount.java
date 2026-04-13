package exception_io_files;

import java.io.*;

public class WorldCount {
	public static void main(String[] args) throws IOException {

		try (FileInputStream fin = new FileInputStream("test.txt")) {
			int j = 0;
			String str = "";
			int wordCount = 0;
			while ((j = fin.read()) != -1) {
				str+= (char)j;
			}
			String strarr=str.trim();
			boolean inWord = false;
			for (int i = 0; i < strarr.length(); i++) {
			    char ch = strarr.charAt(i);

			    if (!Character.isWhitespace(ch)) {
			        if (!inWord) {
			            wordCount++;
			            inWord = true;
			        }
			    } else {
			        inWord = false;
			    }
			}

			System.out.println("Word Count :" + wordCount);
			System.out.println("Try Block Called...");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Released Data");
		}

	}

}
