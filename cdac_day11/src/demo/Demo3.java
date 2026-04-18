package demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		String str = null;
		List<String> line = Files.readAllLines(Path.of("test2.txt"));
		for (String s : line) {
			System.out.println(s);
		}
		Files.write(Path.of("data.txt"/* ,true */),
				Arrays.asList("Ishwar", "SaiSagar", "Aditya", "Siddhart", "Ashish", ""));

	}

}
