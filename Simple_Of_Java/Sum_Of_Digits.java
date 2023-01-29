import java.util.Scanner;

class Sum_Of_Digits {
	public static void main(String args[]) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		sc.close();

		num = sc.nextInt();
		for (; num > 0;) {
			num = num % 10;
			sum += num;
		}
		System.out.println(sum);
	}
}
