class o1tria {
	public static void main(String args[]) {
		int x = 6;

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {

				if ((i + j) % 2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}

	}
}
/*
Printing 0-1 Pattern/Triangle
Ouput:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1 

 */