package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class getname {
	public static void main(String[] args) throws IOException{
		System.out.println("What's your name?");
		String name = getName2();
		if (("Alice".equals(name)) | ("Bob".equals(name))){
			System.out.println("Hello, "+name);
		}else{
			System.out.println("You cann't get here");
		}
	}
	
	public static String getName() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		return str;
	}
	
	public static String getName2(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
}
