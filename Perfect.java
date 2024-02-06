
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		String ans = n + " is a perfect number since " + n + " = 1";
		int sum = 1;
		for (int i = 2 ; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
				ans = ans + " + " + i;
			}
		}
		if (n != sum) {
			ans = n + " is not a perfect number";
		}
		System.out.println(ans);
	}
}