// conversion of binary to decimal ,

// import java.util.Scanner;

// public class Mian {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int binary_num = sc.nextInt();

//         int ans = 0; //converted decimal number 
//         int p = 1; // power of 2; 2 ^ 0 = 1

//         while(binary_num > 0){
//             int unit_digit = binary_num % 10;
//             ans += (unit_digit * p);
//             binary_num /= 10;
//             p *= 2;
//         }
//         System.out.println(ans);
//     }
// }
 
/*------------------------------------------------------------------- */

// conversion of decimal to binary

// import java.util.Scanner;
// public class Mian {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         int decimal_num = sc.nextInt();

//         int ans = 0;
//         int p = 1;

//         while(decimal_num > 0){
//             int parity = decimal_num % 2;
//             ans +=(parity * p);
//             p *= 10;
//             decimal_num /= 2;
//         }
//         System.out.println(ans);
//     }
// }