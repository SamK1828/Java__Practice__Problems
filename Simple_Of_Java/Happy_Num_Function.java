
// Check Whether Given Number is Happy Number Or Not By using Funtion....
import java.util.Scanner;

class happyno {

	public static int happy(int num) {
		int sum = 0, remainder = 0;
		for (; num > 0;) {
			remainder = num % 10;
			sum = sum + (remainder * remainder);
			num = num / 10;

		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter NO.");
		int num = sc.nextInt();
		sc.close();
		int result = num;

		for (; result != 1 && result != 4;) {

			result = happy(result);
		}

		if (result == 1) {
			System.out.println(" Happy Number....");
		} else {
			System.out.println(" NOT an Happy Number....");
		}
	}
}
