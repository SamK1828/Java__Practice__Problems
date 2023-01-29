import java.util.Scanner;

class Check_Happy_Num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter NO.");
		int num = sc.nextInt();
		int remainder = 0;
		int sum = 0;

		for (; num > 9;) {

			for (; num > 0;) {

				remainder = num % 10; // 82%10=2
				sum = sum + (remainder * remainder);// 2*2+0=4
				num = num / 10; // 82/10=8

			}
			num = sum; // now num=sum=8
			sum = 0;

		}

		if (num == 1) {
			System.out.println(" Happy Number....");
		} else {
			System.out.println(" NOT an Happy Number....");
		}
	}
}