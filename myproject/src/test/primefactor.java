package test;

public class primefactor {
	public static boolean isPrime(long i){
		for(long j = 2;j<i;j++){
			if (i%j ==0)
				return false;
		}
		return true;
	}
	
	public static double getLargestPrimeFactor(long i){
		for(long j = i-1;j >0;j--){
			if(isPrime(j)){
				if(i%j==0)
					return j;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		long l = 600851475143L;
		System.out.println(getLargestPrimeFactor(l));
	}
}
