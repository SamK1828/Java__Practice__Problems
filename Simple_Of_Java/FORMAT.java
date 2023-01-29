// This Program has appeared in HackerRank in OutputFormatting.....
//Using printf() 


import java.util.Scanner;

public class FORMAT{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		sc.close();
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			int x=sc.nextInt();
			System.out.printf("%-14s %03d\n", s1, x); //printf=print format->14s means within 14 spaces and %03d means three digits if not zeroes will be there
		}
		System.out.println("================================");
	}
}