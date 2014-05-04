package problem9;

public class PlythagereanTriplet {
	public static boolean isPly(int a,int b,int c){
		int a2 = (int) Math.pow(a, 2);
		int b2 = (int) Math.pow(b, 2);
		int c2 = (int) Math.pow(c, 2);
		if((a2+b2)==c2)
			return true;
		return false;
	}
	
	public static int specialPlyTri(int i){
		for(int a = 1;a<i;a++){
			for(int b = a+1;b<(i-a-b);b++){
				if(isPly(a,b,i-a-b)){
					return a*b*(i-a-b);
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		System.out.println(specialPlyTri(1000));
	}
}
