
// import java.util.Scanner;
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int num=n; num >= 1; num--){
//             System.out.println(num);
//         }
//     }
// }

/*------------------------------------------------------ */
// print the first multiple of 5 which is also a multiple of 7
// public class lups{
//     public static void main(String[] args) {
//         int num = 1;
//         while (true) {
//             if((num%5==0) && (num%7==0)){
//                 System.out.println("Found ans " + num);
//                 break;
//             }
//             num++; 
//         }
//     }
// }

/*------------------------------------------------------------------- */
//print all the value between 1-50 exept for the multiple of 3
// public class lups{
//     public static void main(String[] args) {
//         for(int num = 1; num <= 50; num++){
//             if(num%3==0){
//                 continue;
//             }
//             System.out.println(num);
//         }
//     }
// }
// public class lups {
//    public static void main(String[] args) {
//     int num=1;
//     while(num<=50){
//         if(num%3==0){
//             num++;
//             continue;
//         }
//         System.out.println(num);
//         num++;
//     }
//    } 
// }

/*------------------------------------------------------------ */
//count the no. of the digit for aq given no. n
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int numOfDigits = 0;
//         int original_n = n;
//         while(n>0){
//             n=n/10;
//             numOfDigits++;
//         }
//         System.out.println("Number of digits in " + original_n + " = " + numOfDigits);
//     }
// }
/*-------------------------------------------------------------- */
// find the sum of digit in a given number n
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int sumOfDigit = 0;
//         int original_n = n;
//         while (n>0) {
//             sumOfDigit += n%10;
//             n = n/10;
//         }
//         System.out.println("Number of digit in " + original_n + " = " + sumOfDigit);
//     }
// }
/*------------------------------------------------------------------------ */
// reverse the digit of a number
// import java.util.Scanner;
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         while (n>0) {
//             ans = ans * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(ans);
//     }
// }

/*------------------------------------------------------------------- */
// find the sum of the following series
//   S = 1-2+3-4 ....
// public class lups {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int ans = 0;
//     for( int i = 1; i <= n; i++){
//         if(i % 2 == 0){
//             ans -= i;
//         } else {
//             ans += i;
//         }
//     }
//     System.out.println(ans);
//     }
// }
/*----------------------------------------------------------------- */
// print the n factorial number
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for( int i = 1; i <= n; i++){
//             fact = fact * i;
//             System.out.println("Factorial of " + i +": " + fact);
//         }
//     }
// }

/*-------------------------------------------------------------- */
// Given 2 number a and b. find a raise to the power b
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int ans = 1;
//         for( int i = 1; i <= b; i++){
//             ans *= a;
//         }
//         System.out.println(ans);
//     }
// }

/*--------------------------------------------------------------------- */
// print rectangular pattern
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i = 1; i <= r; i++){
//             for(int j = 1; j <= c; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*------------------------------------------------------------------- */
//  ******
//  *    *
//  *    *
//  ******
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i = 1; i <= r; i++ ){
//            for(int j = 1; j <= c; j++){
//             if( i == 1 || i == r || j == 1 || j == c)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             }
//             System.out.println();
//            }        
//          }
//     }    

/*---------------------------------------------------------------- */
// *
// **
// ***
// ****
//  public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for( int i = 1; i <= r; i++){
//             for( int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }

/*--------------------------------------------------------------------- */
// ****
// ***
// **
// *
//  public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for( int i = 1; i <= r; i++){
//             for( int j = 1; j <= (r+1-i); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }          OR
//  public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for( int i = r; i >= 1; i--){
//             for( int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }

/*---------------------------------------------------------------- */
//       *
//      ***
//     *****
//    *******   
// public class lups
// {
// public static void main(String[] args) {
// int rows;
// Scanner sc = new Scanner(System.in);
// rows=sc.nextInt();
// for(int i = 1, k = 0; i <= rows; ++i, k = 0)
// {
// for(int s = 1; s <= rows-i; ++s)
// {
// System.out.print(" ");
// }
// while(k != 2*i-1)
// {
// System.out.print("*");
// ++k;
// }
// System.out.println("");
// }
// }
// }
/*----------------------------------------------------------------- */
// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for( int i = 1; i <= r; i++){
//             for( int j = i; j <= r; j++){
//                 System.out.print(j);
//             }
//             for( int k = 1; k <= i-1; k++){
//                 System.out.print(k);
//             }
//             System.out.println( );
//         }
//     }
// }
/*-------------------------------------------------------------------- */
// 123456
// 123456
// 123456
// 123456
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i = 1; i <= r; i++){
//             for(int j = 1; j <= c; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
/*-------------------------------------------------------------------- */
// 121212
// 212121
// 121212
// 212121
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i = 1; i <= r; i++){
//             for(int j = 1; j <= c; j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(2);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
/*------------------------------------------------------------------ */
// 1
// 12
// 123
// 1234
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i = 1; i<=r;i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
/*--------------------------------------------------------------------- */
//     1
//    121  
//   12321
//  1234321  
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i = 1; i <= r; i++){
//             //print r-i spaces
//             for(int j = 1; j <= r-i; j++){
//                 System.out.print(" ");
//                 }
//                 // print 1 to i
//                 for(int k = 1; k <= i; k++){
//                     System.out.print(k);
//                 }
//                 // print i-1 to 1
//                 for(int l = i-1; l >= 1; l--){
//                     System.out.print(l);
//                 }
//                 System.out.println();
//             }
//         }
// }

/*-------------------------------------------------------------------- */
//       1
//      2  2
//     3    3
//    44444444 
// public class lups {
//     public static void main(String[] args) {
//         int i, j, k, rows;
//         Scanner sc = new Scanner(System.in);
//         rows = sc.nextInt();
//         for (i = rows + 1; i > 1; i--) {
//             for (j = i; j > 2; j--) {
//                 System.out.print(" ");
//             }
//             for (k = 1; k <= (rows - i + 1); k++) {
//                 if (k == 1) {
//                     System.out.print(rows - i + 2);
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             for (int m = k; m >= 1; m--) {
//                 if (m == 1) {
//                     System.out.print(rows - i + 2);
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }
/*---------------------------------------------------------------------- */
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int row = 1; row <= n; row++){
//             // for every row, run the col
//             for( int col = 1; col <= row; col++){
//                 System.out.print(col + " ");
//             }
//             System.out.println();
//         } 
//     }
// }

/*----------------------------------------------------------------- */
//      *
//      **
//      ***
//      ****
//      *****
//      ****
//      ***
//      **
//      *
// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int row = 0; row < 2 * n; row++){
//             int totalColInRow = row > n ? 2 * n - row: row;
//             for(int col = 0; col < totalColInRow; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/*------------------------------------------------------------------ */
//       *
//      * * 
//     * * *
//    * * * * 
//   * * * * * 
//  * * * * * * 
//   * * * * * 
//    * * * *
//     * * *
//      * * 
//       *
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int  row = 0; row < 2 * n; row++){
//             int totalColInRow = row > n ? 2 * n - row: row;
//             int noOfSpaces = n - totalColInRow;
//             for(int s = 0; s < noOfSpaces; s++){
//                 System.out.print(" ");
//             }
//             for(int col = 0; col < totalColInRow; col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
/*---------------------------------------------------------------------- */
// multiplication table
// import java.util.Scanner;
// public class lups {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the num: ");
//         int num = sc.nextInt();
//         printMultiplicationTable(num);
//     }
//     public static void printMultiplicationTable(int num) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(num + " X " +i+ " = " + (num * i));
//             i++;
//         }
//     }
// }
//Sum of odd num
// import java.util.Scanner;
// public class lups {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println(" Enter your num: ");
//             int num = sc.nextInt();
//             int sum = oddSum(num);
//             System.out.println("OddSum till " + num + " is: " +sum);
//         }
//         public static int oddSum(int num){
//                 int sum = 0 ;
//                 int i = 1;
//                 while(i <= num){
//                         sum += i;
//                         i += 2;
//                 }
//                 return sum;
//         }
// } 

// factorial

// import java.util.Scanner;
// public class lups {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the num: ");
//         int a = sc.nextInt();
//         long fact = factorial(a);
//         System.out.println("Factorial is: "+fact);
//     }
//     public static long factorial(int num){
//         if(num<2){
//            return 1;
//         }        
//         long fact = 1;
//         int i = 2;
//         while(i <= num){
//                 fact *= i;
//                 i++;
//         }
//         return fact;
//     }
// }

// Sum of digit
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the Number: ");
//                 int num = sc.nextInt();
//                 int sum = sumOfDigits(num);
//                 System.out.println("Sum of digit id: "+sum);
//         }
//         public static int sumOfDigits(int num){
//                 int sum = 0;
//                 while (num>0) {
//                     sum += num % 10;
//                     num /= 10;    
//                 }
//                 return sum;
//         }
// }

//LCM
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the num1: ");
//                 int num1 = sc.nextInt();
//                 System.out.println("Enter the num2: ");
//                 int num2 = sc.nextInt();
//                 int lcm = lcm(num1, num2);
//                 System.out.println("LCM of the numbers is: "+lcm);
//         }

//         public static int lcm(int num1,int num2){
//                 int i = 1;
//                 while( i<=num2){
//                         int factor = num1 * i;
//                         if(factor % num2 == 0){
//                                 return factor;
//                         }
//                         i++;
//                 }
//                 return  0; //unreachable
//         }
// }

//GCD
// import java.util.Scanner;
// public  class lups {

//         public static void main(String[] args) {
//                 java.util.Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter num1: ");
//                 int num1 = sc.nextInt();
//                 System.out.println("Enter num2: ");
//                 int num2 = sc.nextInt();
//                 int gcd = gcd(num1, num2);
//                 System.out.println("GCD of number is: "+gcd);
//         }
//         public static int gcd(int num1, int num2){
//                 int gcd = 1;
//                 int i = 2;
//                 int least = least(num1, num2);
//                 while( i <= least){
//                         if( num1 % i == 0 && num2 % i == 0){
//                                 gcd = i;
//                         }
//                         i++;
//                 }
//                 return gcd;
//         }
//         public static int least(int num1, int num2){
//                 if(num1<num2){
//                         return 1;
//                 }else{
//                         return num2;
//                 }
//         }
// }

//prime number
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the number: ");
//                 int num = sc.nextInt();
//                 boolean prime = prime(num);
//                 System.out.println("The number is: "+prime);
//         }
//         public static boolean prime(int num){
//                 int i = 2;
//                 while(i < num){
//                         if( num % i ==0){
//                                 return false;
//                         }
//                         i++;
//                 }
//                 return true;
//         }
// }

//reverse the number
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the number: ");
//                 int num = sc.nextInt();
//                 int reverse = reverse(num);
//                 System.out.println("The number is: "+reverse);   
//         }
//         public static int reverse(int num){
//                 int newNum = 0;
//                 while(num> 0 ){
//                         int digit = num % 10;
//                         newNum = newNum * 10 + digit;
//                         num /= 10;
//                 }
//                 return  newNum;
//         }
// }

//fibonacci series
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the number: ");
//                 int num = sc.nextInt();
//                 fibonaci(num);
//                 System.out.println("The fibonacci is: ");
//         }
//         public static void fibonaci(int num){

//                 if (num < 0) return;
//                 System.out.println("0 ");
//                 if(num == 0) return;
//                 System.out.print("1 ");
               
//                 int first = 0;
//                 int second = 1;
//                 while( first + second <= num){
//                         int third = first + second;
//                         System.out.println(third + " ");
//                         first = second;
//                         second = third;
//                 }
//         }
// }

//Armstrong number
// import java.util.Scanner;
// public class lups {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the number: ");
//                 int num = sc.nextInt();
//                 boolean isArmstrong = isArmstrong(num);
//                 if(isArmstrong){
//                         System.out.println("num is armstrong");
//                 }else{
//                         System.out.println("num in not armstrong");
//                 }
//         }
//         public static boolean isArmstrong(int num){
//                 int noOfDigit = noOfDigit(num);
//                 int numCopy = num;
//                 int finalNumber = 0;
//                 while(num > 0){
//                         int digits = num % 10;
//                         num /= 10;
//                         finalNumber += pow(digits, noOfDigit);
//                 }
//                 return finalNumber == numCopy;
//         }

//        public static int pow(int num1, int num2){
//                 int result = num1;
    
//                 int i = 0;
//                 while( i < num2){
//                         result *= num1;
//                         i++;
//                 }
//                 return result;
//        }

//         public static int noOfDigit(int num){
//                 int digit = 0;
//                 while( num > 0){
//                    digit++;
//                    num /= 10;
//                 }
//                 return digit;
//         }

// }

//palindrom sequnce

