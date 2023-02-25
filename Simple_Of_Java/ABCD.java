import java.util.*;



class ABCD {
    public static void main(String[] args)  
{
	Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
     int letter = 65; //ASCII value of capital A is 65  
//inner loop for rwos  
     for (int i = 0; i<=n; i++)  
{  
  //outer loop for columns  
   for (int j = 0; j <=i; j++)  
{  
//prints the character  
     System.out.print((char) letter + " ");  
}  
letter++;  
System.out.println();  
}  
}  
}