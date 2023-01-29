/* Print Hollow Rectangle:
	*******
	*	  *
	*     *
	*******
 */

import java.util.Scanner;

class hollowrect{
	public static void main(String args[]){
		int rows,colums;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of rows and colums:");
		rows = input.nextInt();
		colums = input.nextInt();
		input.close();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=colums;j++){
				if(i==1||j==1||i==rows||j==colums){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}