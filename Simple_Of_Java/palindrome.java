// Check Given Input(Integer) is Palindrome or Not... [EG: 1221,1331,1001,121,etc]
class palindrome {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454;

		temp = n;
		for (; n > 0;) {
			r = n % 10; // 454%10= 4, 45%10=5,4%10=4
			sum = (sum * 10) + r; // sum=(0*10)+4=4, sum=(4*10)+5=45, sum=(45*10)+4=454
			n = n / 10; // 454/10=45, 45/10=4 then loop ends
		}
		if (temp == sum)
			System.out.println("Given no. is palindrome number");
		else
			System.out.println("Given no. is not palondrome number");
	}
}
