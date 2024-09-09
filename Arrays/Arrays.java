
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

// cal the maximum value of all the elements 

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = { 2,8,5,6,14};
//         int ans = 0;
        
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > ans){
//                 ans = arr[i];
//             }
//         }
//         System.out.println(ans);
//     }
// }

/*--------------------------------------------------------------- */

// search the given element x in the array. if present then return the index else return -1.

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {10,8,6,9,4};
//         int x = 2;
//         int ans = -1;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == x){
//                 ans = i;
//             }
//         }
//         System.out.println("FOUND " +x+ " at index " +ans);
//     }
// }

/*------------------------------------------------------------------------ */

// Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {2, 6, -5, -1, 0, 4, -9};

//         for(int val: arr){
//             if(val >= 0){
//                 System.out.println(val);
//             }
//         }
//     }
// }


/*------------------------------------------------------------------------------------------- */

// Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         for(int val: arr){
//             if(val % 2 == 0){
//                 System.out.println(val);
//             }
//         }
//     }
// }

/*---------------------------------------------------------------------------- */

// Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element.

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {2, -3, 5, 8, 1, 0, -4};
//         for(int i = 0; i < arr.length-1; i++){
//             if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }

/*--------------------------------------------------------------------------------- */

// Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0} Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. Leftmost and rightmost element cannot be a peak element.

// public class Arrays {

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};
//         for(int i = 0; i < arr.length-1; i++){
//             if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }

/*----------------------------------------------------------------------- */

//taking input from an array

// import java.util.Scanner;

// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter " +n+ " element");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

/*------------------------------------------------------------------------ */

// functions in array

// public class Arrays {

//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[] = {98, 56, 45};
//         update(marks);

//         //print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.println(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }

/*------------------------------------------------------------------------------------- */

//linear search

// import java.util.*;
// public class Arrays {

//     public static int linearSearch(int numbers[], int key){

//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index: " +index);
//         }
//     }
// }

/*--------------------------------------------------------------------------------- */
// find largest and smallest value
// public class Arrays {

//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE; //-infinite value
//         int smallest = Integer.MAX_VALUE; //INFINITE VALUE

//         for(int i=0; i<numbers.length; i++){
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest value is :" +smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,2,6,3,5};
//         System.out.println("largest value is : " +getLargest(numbers));
//     }
// }

/*--------------------------------------------------------------------------------------- */

// binary search

// public class Arrays {

//     public static  int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length-1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             //comparsion
//             if(numbers[mid] == key) { //found
//                 return mid;
//             }
//             if(numbers[mid] < key) { //right
//                 start = mid+1;
//             }else{ //left
//                 end = mid-1;    
//             }
//         }
//         return -1;

//     }
//      public static void main(String[] args) {
//         int numbers[] = {2,4,6,10,12,16,14};
//         int key = 10;

//         System.out.println("index for key is : " + binarySearch(numbers, key) );
//      }
// }

/*--------------------------------------------------------------------------- */

//reverse an array

// public class Arrays {

//     public static void reverse(int numbers[]) {
//         int first = 0;
//         int last = numbers.length-1;

//         while(first < last) {
//             //swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};

//         reverse(numbers);

//         //print
//         for(int i=0; i<numbers.length; i++) {
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();
//     }
// }

/*----------------------------------------------------------------------------- */

// pairs in an array

// public class Arrays {

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printPairs(numbers);
//     }

//     public static void printPairs(int numbers[]) {
//         int tp = 0;
        
//         for(int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i]; //2,4,6,8,10
//             for(int j = i+1; j < numbers.length; j++) {
//                 System.out.print("(" + curr+ "," + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total Pairs = "+tp);
//     }
// }

/*------------------------------------------------------------------------ */

// print subarrays - a continous part of array

// public class Arrays {

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubarrays(numbers);
//     }
//     public static void printSubarrays(int numbers[]) {
//         int ts = 0;

//         for(int i=0; i<numbers.length; i++) {
            
//             int start = i;
//             for(int j = i; j<numbers.length; j++) {

//                 int end = j;
//                 for(int k = start; k<=end; k++) { //print
//                     System.out.print(numbers[k]+" ");//subarray
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }

//         System.out.println("Total subarrays = "+ts);
//     }

// }

/*------------------------------------------------------------------------ */

// Max Subarray sum  ==> brute force

// public class Arrays {

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarray(numbers);
//     }
//     public static void maxSubarray(int numbers[]) {
//           int currSum = 0;
//           int maxSum = Integer.MIN_VALUE;

//           for(int i = 0; i<numbers.length; i++) {

//             int start = i;
//             for(int j = i; j<numbers.length; j++) {
//                  int end = j;
//                  currSum = 0;
//                  for(int k = start; k<=end; k++){
//                     //subarrays sum
//                     currSum += numbers[k];
//                  }
//                  System.out.println(currSum);
//                  if(maxSum < currSum) {
//                     maxSum = currSum;
//                  }
//             }
//           }
//           System.out.println("max sum = "+maxSum);
//     }
// }

/*----------------------------------------------------------------------- */

// Max subarray sum ==> prefix sum

public class Arrays {

    public static void main(String[] args) {
        
    }
}