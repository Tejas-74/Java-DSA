// example method
// public class Main {
//     static void welcome() {
//         System.out.println(" Welcome to PW ");
//     }
//     public static void main(String[] args) {
//         welcome();
//     }
// }

/*------------------------------------------------------------------ */

// add two num using methods

// import java.util.Scanner;

// class Algebra{
//     int add(int a, int b){
//         int ans = a + b;
//         return ans;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Algebra obj = new Algebra();
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         System.out.println("Sum of input number is");
//         int ans = obj.add(x, y);
//         System.out.println(ans);
//     }
// }

/*---------------------------------------------------------------- */

// standred library method

// public class Main {

//     public static void main(String[] args) {

//         System.out.println(Math.sqrt(24));
//         System.out.println(Math.sqrt(16));

//         System.out.println(Math.floor(5.3));
//         System.out.println(Math.floor(5.8));
        
//         System.out.println(Math.ceil(5.3));
//         System.out.println(Math.ceil(5.8));
//     }
// }
/*------------------------------------------------------------------------ */
// funtions in java;

// public class Main {

//     public static int printsomething(){
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//         return 3;
//     }
//     public static void main(String[] args) {
//         printsomething();
//     }
// }
/*------------------------------------------------------------------ */

// syntax of funtion n methods with paramter

// import java.util.*;

// public class Main{
// public static void calSum( int num1, int num2){
//     int sum = num1 + num2;
//     System.out.println("Sum is : " +sum );
// }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     calSum(a, b);
// }
// }

/*------------------------------------------------------------ */
// arguments n paramters;

// import java.util.*;

// public class Main{
// public static int calSum( int num1, int num2){ //paramter or formal paramter
//     int sum = num1 + num2;
//     return sum;
// }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = calSum(a, b); //arguments or actual paramter
//     System.out.println("Sum is: " +sum);
// }
// }

/*---------------------------------------------------------------------- */

// call by value; 
 
// public class Main{
// public static void main(String[] args){
    
//     //swap - value exchange
//     int a = 5;
//     int b = 10;

//     //swap
//     int temp = a;
//     a = b;
//     b = temp;

//     System.out.println("a = " +a);
//     System.out.println("b = " +b);
// }
// }

                 // OR  //

// public class Main{

//     public static void swap(int a, int b) {
//         //swap
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " +a);
//         System.out.println("b = "+b);
//     }
//     public static void main(String[] args) {
//         //swap - value exchange
//         int a = 10;
//         int b = 5;
//         swap(a, b);
//     }
// }

/*------------------------------------------------------------------------ */

// find prduct of a and b

// public class Main{
//     public static int multiply(int a, int b) {
//         int product = a * b;
//         return product;
//     }
//     public static void main(String[] args) {
//         int prduct = multiply(5, 5);
//         System.out.println(prduct);
//     }
// } 

/*---------------------------------------------------------------- */

// factorial of n

// public class Main {

//     public static int factorial(int n) {
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }
//         return f;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(4));
//     }
// }

/*----------------------------------------------------------------- */

// binomial coefficient

// public class Main {

//     public static int factorial(int n) {
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }
//         return f; 
//     }

//     public static int binCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r); //(nmr = n-r)

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }
//     public static void main(String[] args) {
//         System.out.println(binCoeff(5,2));
//     }
// }

/*--------------------------------------------------------------------- */

//function overloading

// public class Main {

//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(5, 3, 2));
//     }
// }