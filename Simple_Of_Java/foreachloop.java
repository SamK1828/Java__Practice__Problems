
//Printing Elements Of Multidimensional Arrays Using For-each Loop

class foreachloop {
	public static void main(String args[]) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int x[] : arr) {
			for (int y : x) {
				System.out.println(" " + y);
			}
			System.out.println();
		}
	}
}