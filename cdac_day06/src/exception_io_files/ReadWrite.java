package exception_io_files;

import java.io.*;

public class ReadWrite {
	public static void main(String[] args) throws IOException {

		try (FileInputStream fin = new FileInputStream("test.txt");
		// FileOutputStream fout = new FileOutputStream("Test1.txt")
		) {

			int i = 0;
			int numCount = 0;
			int charCount = 0;
			int wordCount = 0;
			int lineCount = 1;
			int specialChar = 0;
			int vowelCount = 0;

			while ((i = fin.read()) != -1) {
				if ((char) i >= '0' && (char) i <= '9') {
					numCount++;
				} else if ((char) i >= 'a' && (char) i <= 'z' || (char) i >= 'A' && (char) i <= 'Z') {
					charCount++;
				} else if (i == 32) {
					wordCount++;
				} else if (i == 10) {
					lineCount++;
				} else if (!(((char) i >= 'a' && (char) i <= 'z') || ((char) i >= 'A' && (char) i <= 'Z')
						|| ((char) i >= '0' && (char) i <= '9'))) {
					specialChar++;
				} else if ((char) i == 'a' || (char) i == 'e' || (char) i == 'i' || (char) i == 'o' || (char) i == 'u'
						|| (char) i == 'A' || (char) i == 'E' || (char) i == 'I' || (char) i == 'O'
						|| (char) i == 'U') {
					vowelCount++;
				}

				// fout.write((char)i);
			}
			System.out.println("num : " + numCount);
			System.out.println("char : " + charCount);
			System.out.println("word : " + wordCount);
			System.out.println("line : " + lineCount);
			System.out.println("special : " + specialChar);
			System.out.println("Vowels : " + vowelCount);
			System.out.println("try block Called Sucessfully ");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			//fin.close();
			System.out.println("finally Block called!!!!!!");
		}
	}

}
