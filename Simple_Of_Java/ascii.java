//Get ASCII value of Given Character....
import java.util.Scanner;

class ascii{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		sc.close();
		char c;
		System.out.println("Enter Any Character:");
	
		c=sc.next().charAt(0);
		get_ascii_value(c);
		

	}
	static int get_ascii_value(char a)
	{
		int x=a;
		System.out.println("ASCII Value is:"+x);
		return x;
	}
}