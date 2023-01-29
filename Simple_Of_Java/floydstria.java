/*Printing Pattern As Follows:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21
 					*/

class floydstria
{
	public static void main(String args[])
	{
		int x = 6;
		int num = 1;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i; j++)
			{ 
				//counts only no. of elements will present in each row.
				System.out.print(num +" ");
				num++;	// num becomes 2,then num becomes 3.
			}
		System.out.println();
		}
	}
}
