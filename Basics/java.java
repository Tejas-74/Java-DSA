
import java.util.*;


//  public class java{
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         System.out.println("4");
//         System.out.println(4);
//         System.out.println(4+5);
//         System.out.println("4+5");
//     }
//  } 
 
 
/*--------------------------------------------------- */

 // variables

//  import java.util.Scanner;
//  public class java {
//     public static void main(String[] args) {
//         int x;
//         x = 10;
//         System.out.println(x);
//         System.out.println(x+10);
//         x = x + 10;
//         System.out.println(x);
//     }
//  }

/*------------------------------------------------------------- */

// Arithmatic operation

// import java.util.Scanner;
// public class java{
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 2;
//         System.out.println(x+y);
//         System.out.println(x-y);
//         System.out.println(x*y);
//         System.out.println(x/y);

//         System.out.println(y+x);
//         System.out.println(y-x);
//         System.out.println(y*x);
//         System.out.println(y/x);
//     }
// }

/*------------------------------------------------------------- */

// Arithmatic opr. on double data type

// import java.util.Scanner;
// public class java {
//    public static void main(String[] args) {
//     double x = 5;
//     double y = 8;
//     System.out.println(x+y);
//     System.out.println(x-y);
//     System.out.println(x*y);
//     System.out.println(x/y);
//    }
// }

/*-------------------------------------------------------- ----------*/

// cal percentage of 5 subs

// import java.util.Scanner;
// public class java {
//    public static void main(String[] args) {
//     double x1 = 90; //maths
//     double x2 = 91; //science
//     double x3 = 92; //english
//     double x4 = 93; //hindi
//     double x5 = 94; // chemistry

//     double y = (x1+x2+x3+x4+x5)/5;
//     System.out.println(y);
//    }
// }

/*--------------------------------------------------------------------- */

// area of circle

// import java.util.Scanner;
// public class java {
//     public static void main(String[] args) {
//         double radius = 5;
//         double pi = 3.14;
//         double area = pi*radius*radius;
//         System.out.println(area);
//     }
// }

/*------------------------------------------------------------------- */

// cal simple interest

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         double p = 100;
//         double rate = 20;
//         double time = 3;
//         double si = (p*rate*time)/100;
//         System.out.println(si);
//     }
// }

/*------------------------------------------------------------------ */

 // taking input from user

//  import java.util.Scanner;
//  public class java {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius of circle: ");
//         int radius;
//         radius = sc.nextInt();

//         double pi = 3.14;
//         double area = pi * radius * radius;
//         System.out.println("The area of circle is :"+area);
//     }
//  }

/*---------------------------------------------------------------------- */

 // Taking input 

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//     {
//         System.out.println("Whats your name ?");
//         String name = sc.next();
//         System.out.println("Hello"+name+"have a good day");
//     }
//   }
// }

/*------------------------------------------------------------------------------ */

// sum of 2 no

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//             System.out.println("Enter the value of x:");
//             int x = sc.nextInt();

//             System.out.println("Enter the value of y:");
//             int y = sc.nextInt();
            
//             int sum = x+y;
//             System.out.println("Sum of two no is:"+sum);
//         }
//     }
// }

/*----------------------------------------------------------------------- */

// take two int input a,b; a>b, find remainder when a is divided by b

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//            System.out.println("Enter Dividend: ");
//            int a = sc.nextInt();

//            System.out.println("Enter Divisor: ");
//            int b = sc.nextInt();

//            int r = a%b
//            System.out.println(r);
//         }
//     }
// }

/*---------------------------------------------------------------------- */
// predict the output

// public class java {

//     public static void main(String[] args) {
//         int i = 2, j = 3, k, l;
//         double a,b;

//         k = i/j*j;
//         l = j/i*i;
//         a = i/j*j;
//         b = j/i*i;
//         System.out.println(k+" "+l+" "+a+" "+b);
//     }
// }

/*-------------------------------------------------------------------------- */

// ASCI value finder

// abcdefghijklmnopqrstuvwxyz
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// !@#$%^&*(){}[]|?/:;''"".<>,~`_-=+
// 0123456789

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//             char ch = 'a';
//             System.out.println(ch);
//             int x = (int)ch;
//             System.out.println(x);
//         }
//     }
// }

/*------------------------------------------------------------------------------- */

//  convert km to m

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//             System.out.println("Enter the value: ");
//             int km = sc.nextInt();

//             double miles = km * 0.621;
//             System.out.println(miles);
//         }
//     }
// }

/*------------------------------------------------------------------------------- */

//   comparison bet 2 no 

// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//             System.out.println("Enter no; ");
//             int n = sc.nextInt();
//             System.out.println(n>8);
//         }
//     }
// }

/*------------------------------------------------------------------------------ */

// cube of num

// public class java {

//     public static void main(String[] args) {
//         int x=2;
//         int cube = x*x*x;

//         System.out.println("This is side: "+x);
//         System.out.println("This is cube: "+cube);
//     }
// }

/*---------------------------------------------------------------------------- */

// swap two no.

// public class java{
//     public static void main(String[] args) {
//         int num1 = 2;
//         int num2 = 3;

//         System.out.println("The first number before swap is : "+num1);
//         System.out.println("The second number before swap is : "+num2);

//         int temp;

//         temp=num1;
//         num1=num2;
//         num2=temp;

//         System.out.println("the first num after swap is :"+num1);
//         System.out.println("the second num aftefr swap is :"+num2);

//     }
// }

/*------------------------------------------------------------------------------------------- */

// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in))
//         {
//             System.out.println("Enter first name: ");
//             String firstName = sc.next();

//             System.out.println("Enter last name:");
//             String lastName = sc.next();

//             System.out.println("Enter roll.no ");
//             int roll_no = sc.nextInt();

//             System.out.println("Enter Fielf of interest");
//             String fieldOfInterest = sc.next();
            
            
//             System.out.println("Name: "+firstName+" "+lastName);
//             System.out.println("Roll.no: "+roll_no);
//             System.out.println("Feild of interest: "+fieldOfInterest);
//         }
//     }
// }

// import java.util.Scanner;
// public class java {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// String first_name = scn.next();
// String last_name = scn.next();
// int roll_number = scn.nextInt();
// String field_of_interest = scn.next();
// System.out.println("Name: " + first_name + " " + last_name);
// System.out.println("Roll Number: " + roll_number);
// System.out.println("Field of interest: " + field_of_interest);
// }
// }


// NOTE:- whenenver is string in use, use string tej = sc.next()

/*--------------------------------------------------------------------------------------------------------------------- */

// input two different string and put them into same line 

// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// String first = scn.nextLine();
// String last = scn.nextLine();
// System.out.println(first + last);
// }
// }

// import java.util.Scanner;
// public class java {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String first = sc.nextInt();
//     String last = sc.next();
//     System.out.println(first + last);
//    }
    
// }

/*-------------------------------------------------------------------------------------- */

// write a program to add 8 to the number x and then divide it by 3, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. display the result.


// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         System.out.println((((x + 8) / 3 ) % 5) * 5);
//     }
// }

/*---------------------------------------------------------------------------------------- */

// cal the sum of digits of 3-digit num. 

// public class java {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int sum = 0;

//         while(x>0){
//             sum += x % 10;
//             x /= 10;
//         }
//         System.out.println(sum);
//     }
// }

/*--------------------------------------------------------------------------------------------- */

// Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
// i) both the conditions 'a < 50' and 'a < b' are true.
// ii) at least one of the conditions 'a < 50' or 'a < b' is true.

// public class java{
//     public static void main(String[] args) {
//         int a = 55;
//         int b = 70;
//         System.out.println(a < 50 && a < b);
//         System.out.println(a < 50 || a < b);
//     }
// }

/*----------------------------------------------------------------------------------------------- */

// Find the total number of bits needed to be flipped to convert x to y.
// Input: 65 80
// Output: 2

// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int n = x^y;
//         int count = 0;
//         while (n != 0) {
//             n = n & (n - 1);
//             count++;
//         }
//         System.out.println(count);
//     }
// }