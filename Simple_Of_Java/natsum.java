import java.util.Scanner;

class natsum {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements to print sum: ");
		num = sc.nextInt();
		sc.close();
		sum(num);
		System.out.println("Sum of First " + num + " Natural Numbers is:" + sum(num));
	}

	static int sum(int n) {

		if (n > 0) {
			return n + sum(n - 1);
		} else {
			return 0;
		}
	}
}
