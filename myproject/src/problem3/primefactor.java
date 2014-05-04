package problem3;

import java.util.ArrayList;

public class primefactor {
	public static boolean isPrime(long i){
		for(long j = 2; j<i;j++){
			if(i%j ==0)
				return false;
		}
		return true;
	}
	
	public static ArrayList<Long> getFactor(long i){
		ArrayList<Long> al = new ArrayList<Long>();
		long j = 2;
		while(i>1){
			if(i%j==0){
				al.add(j);
				i=i/j;
				while(i%j==0){
					i=i/j;
				}
			}
			j++;
		}
		return al;
	}
	
	public static void main(String[] args){

		long k =600851475143L;
		ArrayList<Long> al = getFactor(k);

		for(int i = 0; i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
}
