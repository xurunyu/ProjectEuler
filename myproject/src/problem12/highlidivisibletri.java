package problem12;

public class highlidivisibletri {
	public static int divnumber(int i){
		int sum = 0;
		int top = (int) Math.sqrt(i);
		for(int j = 1;j<=top;j++){
			if(i%j==0){
				if(j==top){
					sum+=1;
				}else{
					sum+=2;
				}
			}
		}
		return sum;
	}
	
	public static int getOverdiv(int j){
		int i = 1;
		int tnum = 1;
//		int sum = getSum(i);
		while(divnumber(tnum)<j){
			i++;
			tnum+=i;
//			sum = getSum(i);
		}
		return tnum;
	}
	
	public static int getSum(int num){
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}

	
	public static void main(String[] args){
		System.out.println(getOverdiv(500));
	}
}
