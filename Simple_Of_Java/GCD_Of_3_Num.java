import java.util.Scanner;

class gcd {
	public static void main(String args[]) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter First Integer:");
		n1 = sc.nextInt();
		System.out.println("Enter Second Integer:");
		n2 = sc.nextInt();
		System.out.println("Enter Third Integer:");
		n3 = sc.nextInt();

		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2 && i <= n3; ++i) {
			if (n1 % i == 0 && n2 % i == 0 && n3 % i == 0) {
				gcd = i;
			}
		}

		System.out.println("GCD of numbers is:" + gcd);
	}
}
		
	    