
public class TimeComplexity {

	public static void main(String[] args) {

		long beforeTime = System.currentTimeMillis();
		aFunc(16);
		System.out.println(System.currentTimeMillis() - beforeTime);
	}

	public static long aFunc(int n) {
		System.out.println(n);
	    if (n <= 2) {
	        return 1;
	    } else {
	        return aFunc(n - 1) + aFunc(n - 2);
	    }
	}
}
