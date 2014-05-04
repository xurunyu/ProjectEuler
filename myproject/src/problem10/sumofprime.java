package problem10;

import java.util.ArrayList;

public class sumofprime {
	public static ArrayList<Integer> isPrime(int i, ArrayList<Integer> al) {
		for (int j = 0; j < al.size(); j++) {
			if ((i % al.get(j) == 0)||Math.sqrt(al.get(j))>=i)
				return al;
		}
		al.add(i);
		return al;
	}

	public static ArrayList<Integer> getsum(int top) {
		int sum = 0;
		sum += 2;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 3; i < top; i += 2) {
			al = isPrime(i, al);
			if (i == al.get(al.size() - 1))
				sum += i;
		}
		System.out.println(sum);
		return al;
	}

	public static long sumUp(ArrayList<Integer> al){
		long sum = 2;
		for(int i = 0;i<al.size();i++){
			sum+=al.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = getsum(2000000);
		System.out.println(al);
		System.out.println("Sum is " + sumUp(al));
	}

}
