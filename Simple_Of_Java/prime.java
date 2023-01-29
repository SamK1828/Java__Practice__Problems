
//Printing Prime Numbers Between A Range given by User:
import java.util.Scanner;

class prime {
	public static void main(String args[]) {
		int i, i1, i2, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Interval:");
		i1 = sc.nextInt();
		System.out.println("Enter Your Second Interval:");
		i2 = sc.nextInt();
		System.out.println("The Prime Numbers Between " + i1 + " and " + i2 + " is:");
		sc.close();

		for (i = i1; i <= i2; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}
}
/*
 * Output:
 * Enter Your First Interval:
 * 5
 * Enter Your Second Interval:
 * 25
 * The Prime Numbers Between 5 and 25 is:
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 */