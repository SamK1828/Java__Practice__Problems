// A program to perform All String Operaions by String() & Math Operations by Math Functions:
class Operation {
    public static void main(String[] args) {
        String s = "Java Programming";
        char str = s.charAt(3);
        System.out.println("String is : " + s);
        System.out.println(" Character at 3 : " + str);
        System.out.println("Length of String is :" + s.length());
        System.out.println("Substring is : " + s.substring(0, 4));
        System.out.println("Contains : " + s.contains("Java"));
        System.out.println("Equals (java) : " + s.equals("Java"));
        System.out.println("Is empty or empty : " + s.isEmpty());
        System.out.println("Concat Python : " + s.concat(" Python"));
        System.out.println("Replace Java by Js : " + s.replace("Java", "JS"));
        System.out.println("Equals Without case to java Programming : " + s.equalsIgnoreCase("Java Programming"));

        String[] arrOfs = s.split(" ", 0);
        for (String a : arrOfs)
            System.out.println("Splitting the String : " + a);
        System.out.println("Index of p : " + s.indexOf("p"));
        System.out.println(" to lower case : " + s.toLowerCase());
        System.out.println("to upper case : " + s.toUpperCase());
        System.out.println("Trim" + s.trim());

        System.out.println();
        System.out.println();
        System.out.println();
        // Examples of math class
        System.out.println("Absolute of (-4) :  " + Math.abs(-4));
        System.out.println("Max of 10 and 20 is : " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20 is : " + Math.min(10, 20));
        System.out.println("Round of 10.9 is : " + Math.round(10.9));
        System.out.println("Square root of 25 is : " + Math.sqrt(25));
        System.out.println("Cube root of125 is : " + Math.cbrt(125));
        System.out.println("Power of 2^5 is : " + Math.pow(2, 5));
        System.out.println("Signum of 30 : " + Math.signum(30));
        System.out.println("Copysign of 33.9,-9 is : " + Math.copySign(33.9, -9));
        System.out.println("Log (10) : " + Math.log(10));
        System.out.println("log 10(10) : " + Math.log10(10));
        System.out.println("Exponential of 2 : " + Math.exp(2.0));
        System.out.println("Sin(90) : " + Math.sin(90.0));
        System.out.println("cos(45) : " + Math.cos(45.0));
        System.out.println("Floor (10.9) : " + Math.floor(10.9));
        System.out.println("Nextup(6) : " + Math.nextUp(6));
        System.out.println("Nextdown(6) : " + Math.nextDown(6));
        double a = 84352.24;
        double b = 154.284;
        System.out.println("NextAfter(9) : " + Math.nextAfter(a, b));

    }
}
/*
Output:
String is : Java Programming
 Character at 3 : a
Length of String is :16
Substring is : Java
Contains : true
Equals (java) : false
Is empty or empty : false
Concat Python : Java Programming Python
Replace Java by Js : JS Programming
Equals Without case to java Programming : true
Splitting the String : Java
Splitting the String : Programming
Index of p : -1
 to lower case : java programming
to upper case : JAVA PROGRAMMING
TrimJava Programming



Absolute of (-4) :  4
Max of 10 and 20 is : 20
Minimum of 10 and 20 is : 10
Round of 10.9 is : 11
Square root of 25 is : 5.0
Cube root of125 is : 5.0
Power of 2^5 is : 32.0
Signum of 30 : 1.0
Copysign of 33.9,-9 is : -33.9
Log (10) : 2.302585092994046
log 10(10) : 1.0
Exponential of 2 : 7.38905609893065
Sin(90) : 0.8939966636005579
cos(45) : 0.5253219888177297
Floor (10.9) : 10.0
Nextup(6) : 6.0000005
Nextdown(6) : 5.9999995
NextAfter(9) : 84352.23999999999
 */