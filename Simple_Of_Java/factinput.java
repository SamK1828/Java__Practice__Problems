import java.util.Scanner;

class factinput{
	//Fctorial Without Function....

	/*public static void main(String args[]){
	
	int num,fact=1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number:");
	num = sc.nextInt();
	for(;num>0;--num;){
			fact=fact*num;
		}
	
		System.out.println("Factorial of Number is "+ fact);
	*/

    public static void main(String args[]){
        int num;		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number:");
	num = sc.nextInt();
	sc.close();
	printfact(num);
	System.out.println("Factorial of "+num+" is "+printfact(num));
}
   static int printfact(int x){
		int fact=1;
	    for(;x>0;--x){
			fact=fact*x;
		}   
	    return fact;
	}
		
}