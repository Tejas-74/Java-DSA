
import java.util.Scanner;

// import java.util.Scanner;

// public class lups{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int num=1; num <= n; num++){
//             System.out.println(num);
//         }
//     }
// }

/******************************************************** */

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
