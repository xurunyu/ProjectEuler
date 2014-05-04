package test;

import java.util.Scanner;

public class sumnum {
	public static int getNum(){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	public static int getSum(int i ){
		int sum = 0;
		for(; i > 0 ; i--){
			sum = sum + i;
		}
		return sum;
	}
	
	public static int getthreeSum(int i ){
		int sum = 0;
		for(; i > 0 ; i--){
			if(i % 2 != 0)
			sum = sum + i;
		}
		return sum;
	}
	
	public static int getProduct(int i){
		int product = 1;
		for(; i>1; i--){
			product = product * i;
		}
		return product;
	}
	
	public static int getChoice(){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	public static void main(String[] args){
		System.out.println("Give a number: ");
		int i = getNum();
		System.out.println("Do u wanna get the sum from 1 to "+i+" or the pruduct from 1 to "+i+"? ");
		System.out.println("If the sum ,press 1; otherwise press 2");
		int choice = getChoice();
		if (choice == 1){
			System.out.println("The sum from 1 to "+i+" is "+getSum(i));
		}
		else if (choice == 2){
			System.out.println("The product from 1 to "+i+" is "+getProduct(i));
		}else {
			System.out.println("You give the wrong choice");
		}
	}
}
