//Reversing A digit like 1234 to 4321
import java.util.Scanner;

class reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int num = sc.nextInt();
		sc.close();
		int rev = 0;
		int i = num;
		for (; num > 0; num /= 10) { // num=123,123/10=12,
			int digit = num % 10; // 123%10=3,12%10=2,
			rev = rev * 10 + digit; // 0*10+3=3,3*10+2=32
		}
		System.out.println("Reverese of " + i + " is " + rev);
	}

}