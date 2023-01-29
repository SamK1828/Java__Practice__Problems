class butterfly
{
	public static void main(String args[])
	{
		int x = 10;
		//upper half ->
		for(int i=1;i<=x;i++){
			
		    //first half ->	
			for(int j=1;j<=i; j++){ 
				
			System.out.print("*");
			}
		    //spaces
 		    int spaces = 2*(x-i); //2*(10-1)= 18												
		    for(int j=1;j<=spaces;j++){
			System.out.print(" ");
		    }
		    //second half ->
		    for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		//lower half ->
		
		for(int i=x;i>=1;i--){
			
		    //first half ->	
			for(int j=1;j<=i; j++){ 
				
			System.out.print("*");
			}
		    //spaces
 		    int spaces = 2*(x-i);
		    for(int j=1;j<=spaces;j++){
			System.out.print(" ");
		    }
		    //second half ->
		    for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		
		
		
	}
}
