
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int num=1; num <= n; num++){
//             System.out.println(num);
//         }
//     }
// }

import java.util.Scanner;

/**
 * ******************************************************
 */
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

