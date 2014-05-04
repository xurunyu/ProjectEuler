package problem1;

public class mulitsof3and5 {
	public static int getmult(int i){
		if ((i%3 == 0) || (i%5 ==0)){
			return i;
		}
		return 0;
	}
	
	public static void main(String[] args){
		int sum = 0;
		for(int i =1;i<1000;i++){
			sum += getmult(i);
		}
		System.out.println(sum);
	}
	
}
