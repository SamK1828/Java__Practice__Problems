// Printing a ReversePyramid 
class Reverse_Pyramid {
	public static void main(String args[]) {
		int n = 5;
		// First Logic

		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* Output:
		   *********
			*******
		     *****
			  ***
			   *
		 */
		// Another Logic

		/*
		 * for(int i=n;i>=0;i--){
		 * //spaces
		 * for(int j=0;j<n-i;j++){
		 * System.out.print(" ");
		 * }
		 * 
		 * //stars
		 * //printing row no.,row no. times......
		 * for(int j=1;j<i;j++){
		 * System.out.print("*");
		 * }
		 * for(int j=1;j<=i;j++)
		 * {
		 * System.out.print("*");
		 * }
		 * 
		 * System.out.println();
		 * }
		 */
	}
}