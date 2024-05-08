// import java.util.Scanner; 
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

