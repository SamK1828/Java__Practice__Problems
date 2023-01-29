//Taking input of Array & Calculating Sum,Average & Modulus of That Array

import java.util.Scanner;
class arrayinp{
	public static void main(String args[]){
		
		int a,sum=0;
		float avg,mod;
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter no. of elements");
		a = sc.nextInt();
		int array[]= new int[a];
		for(int i=0;i<a;i++){
			array[i] = sc.nextInt();
			}
		System.out.println("All the elements are");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
			sum= sum + array[i];
	}
            avg=sum/array.length;
		    mod=sum%array.length;
			System.out.println("Sum of given integers is " + sum);
			System.out.println("avg of given integers is " + avg);
			System.out.println("mod of given integers is " + mod);
	}
}