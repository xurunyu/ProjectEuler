package test;

public class getPrimenums {
	public static void gets(){
		int[] a = new int[1000000];
		int temp,n, i;
		for(i = 0;i<a.length;i++){
			a[i] = 0;
		}
		a[0]=1;a[1]=1;
		for(i = 0;i<500000;i++){
			if(a[i]==0){
				temp = i *2;
				while(temp<=1000000){
					a[temp] = 1;
					temp+=i;
				}
			}
		}
	}
	
	public static void main(String[] args){
		gets();
	}
	
}
