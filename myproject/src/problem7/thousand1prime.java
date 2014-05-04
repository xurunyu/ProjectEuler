package problem7;

import java.util.ArrayList;

public class thousand1prime {
	public static boolean isPrime(int i){
		for(int j = 2; j<i;j++){
			if(i%j ==0)
				return false;
		}
		return true;
	}
	
	public static ArrayList<Integer> getprimes(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while(al.size()<=10000){
			if(isPrime(i))
				al.add(i);
			i++;
		}
		return al;
	}
	
	public static void main(String[] args){
		System.out.println(getprimes().get(10000));
	}
}
