package problem6;

public class squaredifference {
	public static int getsumsquare(int num){
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum+=Math.pow(i, 2);
		}
		return sum;
	}
	
	public static int getsquaresums(int num){
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum+=i;
		}
		return (int)Math.pow(sum, 2);
	}
	
	public static int getdiff(int num){
		int sum = 0;
		int sum_s = 0;
		for(int i = 1;i<=num;i++){
			sum +=i;
			sum_s += (int)Math.pow(i, 2);
		}
		return (int)Math.pow(sum, 2) -sum_s ;
	}
	
	public static void main(String[] args){
		System.out.println(getdiff(100));
	}
}
