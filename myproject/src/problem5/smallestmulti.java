package problem5;

public class smallestmulti {
	public static boolean multi(int i) {
		for (int j = 1; j <= 20; j++) {
			if (i % j != 0)
				return false;
		}
		return true;
	}

	public static int getsmallmulti() {
		int j = 1;
		while (true) {
			if (multi(j))
				return j;
			j++;
		}
	}

	public static boolean isPrime(long i) {
		for (long j = 2; j < i; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

	public static int getsmallmulti(int i) {
		int N = 1;
		int j = 2;
		boolean check = true;
		double limit = Math.sqrt(i);
		while (j <= i) {
			if (isPrime(j)) {
				int a = 1;
				if (check) {
					if (j <= limit) {
						a = (int) Math.floor((Math.log(i) / Math.log(j)));
					} else {
						check = false;
					}
				}

				System.out.println("it is " + i + "  and j " + j + "  and a "
						+ a);
				N = (int) (N * Math.pow(j, a));
			}
			j++;
		}
		return N;
	}

	public static void main(String[] args) {
		System.out.println(getsmallmulti(20));
	}
}
