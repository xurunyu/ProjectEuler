package problem4;

public class palindrome {
	public static boolean isPalindrome(int i){
		String s1 = Integer.toString(i);
		StringBuffer s2 = new StringBuffer(s1);
		s2 = s2.reverse();
//		System.out.println("s1 :"+s1+"   s2 :"+s2);
		String s3 = s2.toString();
		if(s1.equals(s3)){
			return true;
		}
		return false;
	}
	
	public static int getLargestPalindrome(){
		int maxP = 0;
		for(int i = 999;i>=100;i--){
			for(int j = 999;j>=i;j--){
				int p = i*j;
				if(p<=maxP)
					break;
				if(isPalindrome(p)&&p > maxP){
					System.out.println(i+"   "+j);
					maxP = p;
					
				}
			}
		}
		return maxP;
	}
	
	public static void main(String[] args){
		System.out.println(getLargestPalindrome());
	}
}
