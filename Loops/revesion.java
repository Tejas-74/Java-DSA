
//import java.util.Scanner;

// public class revesion {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int num = 1;
//         while( num<=n){
//             System.out.println(num);
//             num++;
//         }
//     }



// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int num = n; num>=1; num--){
//         System.out.println(num);
//     }
// }


// public static void main(String[] args) {
//     int num = 1;
//     while (true) { 
//         if((num%5 == 0) && (num%7 == 0)){
//             System.out.println("ans "+num);
//             break;
//         }
//         num++;
//     }
// }


// public static void main(String[] args) {
//     for(int num = 1; num <=50; num++){
//         if( num % 3 == 0){
//             continue;
//         }
//         System.out.println(num);
//     }
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int numOfDigit = 0;
//     int original_n = n;

//     while(n>0){
//         n /= 10;
//         numOfDigit++;
//     }
//     System.out.println("Number of Digit in: " +original_n+ " = " +numOfDigit);
// }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt(); 
//     int sumOfDigits = 0;
//     int original_n = n;

//     while(n>0){
//         sumOfDigits += n % 10;
//         n = n / 10;
//     }
//     System.out.println("Sum of Digit is: " + original_n+ " = " +sumOfDigits);
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
     
//     int ans = 0;
//     while(n > 0){
//         ans = ans * 10 + n % 10;
//         n /= 10;
//     }
//     System.out.println(ans);
// }


//}
