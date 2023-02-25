/*class PracticalNo3{
void add(int a, int b){
System.out.println("In Function 1.\n The addition of two integer is : "+(a+b));
}
void add(int a,int b,int c){
System.out.println("In function 2 \n The addition of three integer is : "+(a+b+c));
}
void add(double a,double b){
System.out.println("In function 3 \n The Addition of two double is : "+(a+b));
}
  void add(double a, double b, double c){
System.out.println("In function 4 \n The addition of three double is : "+(a+b+c));
}
public static void main(String[] args) {
PracticalNo3 m=new PracticalNo3();
m.add(4,6);
m.add(3,5,6);
m.add(7.8,4.0);
m.add(12.0,56.0,13.8);
}
}

/*Output:
C:\Users\kalegaonkar\Documents\Saved of Java>javac PracticalNo3.java
C:\Users\kalegaonkar\Documents\Saved of Java>java PracticalNo3
In Function 1.
 The addition of two integer is : 10
In function 2
 The addition of three integer is : 14
In function 3
 The Addition of two double is : 11.8
In function 4
 The addition of three double is : 81.8
 */
 public class PracticalNo3
{
int n,y;
PracticalNo3(){
n=0;
y=0;
}
PracticalNo3(int x, int z){
n=x;
y=z;
}
PracticalNo3(PracticalNo3 m){
n=m.n;
y=m.y;
}
public static void main(String[] args) {
PracticalNo3 m1=new PracticalNo3();
PracticalNo3 m2=new PracticalNo3(10,20);
PracticalNo3 m3=new PracticalNo3(m2);
System.out.println("In default Constructor \n Object 1 : "+m1.n+" "+m1.y);
System.out.println("In Parameterized Constructor \n Object 2 : "+m2.n+" "+m2.y);
System.out.println("In Copy Constructor \n Object 3 : "+m3.n+" "+m3.y);
}
}

/*In default Constructor
 Object 1 : 0 0
In Parameterized Constructor
 Object 2 : 10 20
In Copy Constructor
 Object 3 : 10 20*/