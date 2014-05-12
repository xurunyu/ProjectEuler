package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class filereader {
	public static void main(String[] args) throws IOException{
		FileInputStream it = new FileInputStream(new File("src/test/test.txt"));
		InputStreamReader reader = new InputStreamReader(it);
		int ch = 0;
		while((ch = reader.read()) != -1 ){
			System.out.println((char)ch);
		}
	}
}
