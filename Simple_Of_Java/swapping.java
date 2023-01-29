//Swapping Of Two Numbers Without Using A Third Variable......
class swapping {
	static void swap(int x, int y) {
		x = x + y;// x=10+20
		y = x - y;// y=30-20
		x = x - y;// x=30-10
		System.out.println("First Value:" + x + " " + "Second Value:" + y);

	}

	public static void main(String args[]) {
		int n = 10;
		int m = 20;
		System.out.println("Before Swapping->");
		System.out.println("First Value:" + n + " " + "Second Value:" + m);
		System.out.println("After Swapping->");
		swap(n, m);

	}

}