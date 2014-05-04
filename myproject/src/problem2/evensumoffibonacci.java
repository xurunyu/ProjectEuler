package problem2;

import java.io.Console;

public class evensumoffibonacci {

		public static int even(int i){
			if(i%2==0){
				return i;
			}
			return 0;
		}
		
		
		public static int evensum(){
			int num1 = 1;
			int num2 = 1;
			int sum = 0;
			sum += even(num1) + even(num2);
			
			for(;num2<4000000;){
				sum +=even(num2);
				int tmp = num1 + num2;
				num1 = num2;
				num2 = tmp;
				
//				System.out.println(num3);
			}
			return sum;
		}
		
		public static void main(String[] args){
			System.out.println(evensum());
		}
}
