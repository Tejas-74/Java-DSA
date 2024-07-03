

// import java.util.Scanner;
// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a num: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("Interger is even");
//         }
//         if( num % 2 != 0){
//             System.out.println("Integer is odd");
//         }
//     }
// }

/*--------------------------------------------------------------------------------------- */

// random leap year

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the year: ");
//         int y = sc.nextInt();

//         if (y % 4 == 0) {
//             System.out.println("Year is leap");
//         } else {
//             System.out.println("Year is not leap");
//         }
//     }
// }

/*----------------------------------------------------------------------------- */

// take integer input and print the absolute value of that integer 

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer: ");
//         int n = sc.nextInt();

//         if (n < 0) {
//             n = n * (-1);
//         }
//         System.out.println("The absoute value is: "+n);
//     }
// }

/*-------------------------------------------------------------------------------- */

// if cost price and selling price of an item is input through the keyborad, write a program to determine wheather the seller has made profit or incurred loss. also determined how much profit he made or loss he incured 

// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter cost price: ");
//         int cp = sc.nextInt();

//         System.out.println("Enter selling price: ");
//         int sp = sc.nextInt();

//         if (cp > sp) {
//             System.out.println("Your profit is: ");
//             System.out.println(sp-cp);
//         }else{
//             System.out.println("You incurred a loss");
//             System.out.println(cp - sp);
//         }
//     }
// }

/*---------------------------------------------------------------------------------------- */

// find area and perimter of rect., also find area is greater or perimter 

// import java.util.Scanner;
// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter lenght: ");
//         int l = sc.nextInt();

//         System.out.print("Enter breadth: ");
//         int b = sc.nextInt();

//         int area = l*b;
//         int perimter = 2*(l+b);

//         System.out.println("area is: "+area);
//         System.out.println("perimter is: "+perimter);

//         if (area>perimter) {
//             System.out.println("Area is greater than perimater");
//         } else {
//             System.out.println("Perimeter is greater than area");
//         }
//     }
// }

/*----------------------------------------------------------------------------------------------------- */

// take percentage wise assuption of marks in exams 

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks of student: ");
//         int marks = sc.nextInt();

//         if (marks>=90){
//             System.out.println("Exellent");
//         }
//         else if(marks>=80){
//             System.out.println("Very good");
//         }
//         else if(marks>=70){
//             System.out.println("Good");
//         }
//         else if(marks>=60){
//             System.out.println("Can do better");
//         }
//         else if(marks>=50){
//             System.out.println("Average");
//         }
//         else if(marks>=40){
//             System.out.println("Below average");
//         }
        
//         else{
//             System.out.println("Fail");
//         }
//     }
// }

/*----------------------------------------------------------------------------------------- */

// take positive interger input and tell if it is a three digit number or not 

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter the integer: ");
//         int n = sc.nextInt();

//         if (n>99 && n>100) {
//             System.out.println("inter is 3 digit num");
//         } else {
//             System.out.println("Integer is 2 digit num");
//         }
//     }
// }

/*------------------------------------------------------------------------------------ */

// take positive integer input and tell if it is divisible by 5 and 3 

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer: ");
//         int n =sc.nextInt();

//         if (n % 5 == 0 && n % 3 ==0) {
//             System.out.println("Integer is Divisible by 5 and 3");
//         } else {
//             System.out.println("Integer is not divisible by 5 and 3");
//         }
//     }
// }

/*------------------------------------------------------------------------------------------- */

// no is divisible by 5 but no by 3

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer: ");
//         int n =sc.nextInt();

//         if (n % 5 == 0 && n % 3 !=0) {
//             System.out.println("Integer is Divisible by 5 but not by 3");
//         } else {
//             System.out.println("Integer is not divisible by 5 and also by 3");
//         }
//     }
// }

/*--------------------------------------------------------------------------------------- */
// take a integer an input, tell if divisible by 5 or 3 

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer: ");
//         int n =sc.nextInt();

//         if (n % 5 == 0 || n % 3 ==0) {
//             System.out.println("Integer is Divisible by 5 or 3");
//         } else {
//             System.out.println("Integer is not divisible by 5 or 3");
//         }
//     }
// }

/*----------------------------------------------------------------------------------- */

// take 3 positive intrger input adnd print the greatest of them 

// import java.util.Scanner;

// public class te {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the integer 1: ");
//         int x1 = sc.nextInt();

//         System.out.println("Enter the integer 2: ");
//         int x2 = sc.nextInt();

//         System.out.println("Enter the integer 3: ");
//         int x3 = sc.nextInt();
        
//         if (x1>x2 && x1>x3) {
//             System.out.println(x1+ " is greatest integer");
//         }if(x2>x1 && x2>x3){
//             System.out.println(x2+ " is greatest integer");
//         }
//         if(x3>x1 && x3>x2){
//             System.out.println(x3+ " is greatest integer");
//         }
//     }
// }

/*------------------------------------------------------------------------------------------------- */

// take input a,b,c as ages, determine youngest of three 

// import java.util.Scanner;

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the Age of perrson 1: ");
//         int a1 = sc.nextInt();

//         System.out.println("Enter the Age of perrson 2: ");
//         int a2 = sc.nextInt();

//         System.out.println("Enter the Age of perrson 3: ");
//         int a3 = sc.nextInt();

//         if (a1<a2 && a1<a3) {
//             System.out.println(a1+ " is youngwst person");
//         }
//         if(a2<a1 && a2<a3){
//             System.out.println(a2+ " is youngest person");
//         }
//         if (a3<a1 && a3<a2) {
//             System.out.println(a3+ " is yougest person");
//         }
//     }
// }

/*------------------------------------------------------------------------------------------------- */

// take 3 num input and tell if they can be the sides of a triangle 

// import java.util.Scanner;

// public class te{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the side1: ");
//         int a = sc.nextInt();

//         System.out.println("Enter the side2: ");
//         int b = sc.nextInt();

//         System.out.println("Enter the side3: ");
//         int c = sc.nextInt();

//         if(a+b>c && b+c>a && a+c>b){
//             System.out.println("it is sides of triangle");
//         }
//         else{
//             System.out.println("it is not sides of tringle");
//         }
//     }
// }

/*------------------------------------------------------------------------------------------------- */

