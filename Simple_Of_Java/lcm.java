import java.util.Scanner;

class lcm {
public static void main(String args[]) {
	int n1, n2;
	int gcd = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First integer:");
	n1 = sc.nextInt();
	System.out.println("Enter Second integer:");
	n2 = sc.nextInt();
	sc.close();
	for (int i = 1; i <= n1 && i <= n2; ++i) {
		if (n1 % i == 0 && n2 % i == 0) {
			gcd = i;
		}
	}
	int lcm = (n1 * n2) / gcd; // Formula or Relation Between LCM,GCD,& GIVEN NUMBERS: (LCM*GCD)=NUM_1* NUM_2
	System.out.println("Lcm of 2 numbers:" + lcm);

}
}