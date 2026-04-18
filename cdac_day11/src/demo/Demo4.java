package demo;

import java.io.*;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		String str = null;
		try (BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt", true))) {
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				bw.append(str);
				bw.newLine();
			}

		} catch (Exception e) {
			System.out.println("In catch !!!!");
		} finally {
			System.out.println("Finnaly block -----------------------------");
		}

//		BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt"));
//		
//		bw.write(new BufferedReader(new FileReader("test1.txt")).readLine());
//		bw.newLine();

	}

}
