package test;

public class getPrimenums {
	public static int[] gets(){
		int[] a = new int[100];
		int temp,n, i;
		for(i = 0;i<a.length;i++){
			a[i] = 0;
		}
		a[0]=1;a[1]=1;
		for(i = 0;i<50;i++){
			if(a[i]==0){
				temp = i *2;
				while(temp<100){
					a[temp] = 1;
					temp+=i;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a =gets();
		for(int i = 0;i<a.length;i++){
			if(a[i]==0)
				System.out.println(i);
		}
	}
	
}
