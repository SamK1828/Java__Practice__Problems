
import java.util.*;
//Question No:08
/*public class S{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		
		for(int i=0;i<n;i++) {
			System.out.print(s1+s2);
		}
	}

}
*/
//Question NO:10
 class S{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		for(int i=0;i<s1.length();i++){
		   	System.out.print(s1.charAt(i));
			
			System.out.print(s2.charAt(i));
		}
	}
}
//Question no:12
/*
public class S{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<n;i++){
			System.out.print(s.substring(n-1));
		}
	}
}
*/
/*public class S
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int l1=s1.length();
		int l2=s2.length();
		for(int i=0;i<l1-l2+1;i++)
		{
			String s=s1.substring(i,i+l2);
			if(i>0 && s.equals(s2))
			{
				System.out.print(s1.substring(i-1,i));
			}
			if(i<l1-l2 && s.equals(s2))
			{
				System.out.print(s1.substring(i+l2,i+l2+1));
			}
			
		}
	}
}
/*

abcXY123XYijk
XY
c13i

*/