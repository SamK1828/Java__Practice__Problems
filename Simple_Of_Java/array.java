//simple Program Of Sum & Average Of A Given Array...

class array{
	public static void main(String args[]){
	int a[] = {10,20,30,40,50};
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	float sum=0,avg;
	for(int i=0;i<a.length;i++)
		sum+= a[i];
		avg=sum/a.length;
		System.out.println("Sum is " + sum);
		System.out.println("Average = " + avg);
	
	}
}
	
	