import java.util.Scanner;
class count{
	public static void main(String args[]){
		int num,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Integer:");
		num= sc.nextInt();
		sc.close();
		for(;num>0;count++){
			num=num/10;
			
		}
		
		System.out.println("No.of digits in the number: "+ count);
	}
}
	