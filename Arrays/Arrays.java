
//     public static void main(String[] args) {
//         // int[] myArr = new int[5];
//         // myArr[0] = 98;
//         // myArr[3] = 65;
//         // myArr[1] = 2;
//         // myArr[2] = 8;
//         // myArr[4] = 37;

//         int[] myArr = {98, 2, 8, 65, 37};
//         // int index = 2;

//         // System.out.println(myArr[0]);
//         // System.out.println(myArr[1]);
//         // System.out.println(myArr[index]);
//         // System.out.println(myArr[3]);
//         // System.out.println(myArr[4]);

//         // array traversal
//         int index = 0;
//         while(index < 5) {
//             System.out.println(myArr[index]);
//             index++;
//         }
//     }
// }


//array searching
// import java.util.Scanner;
// public class Arrays {

//     public static void main(String[] args) {
//         int[] arr = {3, 6, 8, 87, 4, 68, 23, 9, 98, 34};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//         boolean isFound = isFound(arr, num);
//         if(isFound){
//             System.out.println("Your num was found in array");
//         }else{
//             System.out.println("Your num was not found in array");
//         }
//     }

//     public static boolean isFound( int[] arr, int num){
//         int index = 0;
//         while( index < arr.length) {
//             if( arr[index] == num){
//                 return true;
//             }
//             index++;
//         }
//         return false;
//     }
    
// }


// twoD array
// public class Arrays {

//     public static void main(String[] args) {
//         int[][] myArr = new int [2][3];
//         myArr[0][0] = 9;

//         int[][] arr = {{ 1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//         int i = 0;
//         while(i < arr.length){
//              int j = 0;
//              while( j < arr.length){
//                 System.out.print(arr[i][j]+ " ");
//                 j++;
//              }
//              System.out.println();
//              i++;
//         }
//     }
// }

// loops in array 

// public class Arrays {

//     public static void main(String[] args) {
        
//         int[] ages = new int[3];

//         ages[0] = 30;
//         ages[1] = 32;
//         ages[2] = 34;

//         System.out.println(ages[0]);
//         System.out.println(ages[1]);
//         System.out.println(ages[2]);

//         for(int i = 0; i < 3; i++){
//             System.out.println(ages[i]);
//         }

//         // for-each loop
//         for(int age : ages){
//             System.out.println(age);
//         }

//         int i = 0;
//         while(i < 3){
//             System.out.println(ages[i]);
//             i++;
//         }
//     }
// } 


// multidimensional array loops

// public class Arrays {

//     public static void main(String[] args) {
//         int [][] arr = {{78,59,25},{45,56,78},{12,23,45}};

//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j< arr[i].length; j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }

/*------------------------------------------------------------------- */

// cal sum of  array
// input arr[] = {1,5,3}
//output = 9

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {1,5,3};
//         int sum = 0;

//         for(int i = 0; i < arr.length; i++){
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);
//     }
// }