import java.util.Scanner;
class fibonacci{
	
	
	//Without Using Function
	/*public static void main(String args[])
	{
		int n1=0,n2=1,n3,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of elements should be printed:" );
		num= sc.nextInt();
		System.out.println("Fibonaaci Series of "+num+" is: " );
		for(int i=2;i<num;++i)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}*/
	
	public static void main(String args[])
	{    int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No. of Elements:");
		n= sc.nextInt();
		sc.close();
		System.out.println("Fibonacci series :");
	    for(int i=0;i<n;i++){
		
		System.out.println(disp(i)+" ");
		
		}
		
	}
	
	
	static int disp(int n){
		
		if(n<=1)
		{
		 return n;
		}
		 
		  else{
		 return disp(n-1)+disp(n-2);
		
		}
		
		
		
	
	}
}