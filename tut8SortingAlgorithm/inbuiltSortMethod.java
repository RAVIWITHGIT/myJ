/*
if you want inbuilt sort method in java first import Array library from java class
import java.util.Arrays
 */

// import java.util.Arrays;
// public class inbuiltSortMethod{
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={3,2,4,5,1};
//         Arrays.sort(arr);
//         printArray(arr);
//     }
// }


/*
also you can fix range, how many number you want sort
Arrays.sort(array,startingIndex,endingIndex+1);
 */

// import java.util.Arrays;
// public class inbuiltSortMethod{
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={3,2,4,5,1};
//         Arrays.sort(arr,0,3);
//         printArray(arr);
//     }
// }



/*
if you want print Descending sort Array , use Array.sort(array,Collections.reverseOrder()) , use Integer for make array

Integer arr[] = {3,2,4,5,1}  --> right
int arr[] = {3,2,4,5,1}  --> wrong

 */

// import java.util.Arrays;
// import java.util.Collections;
// public class inbuiltSortMethod{
//     public static void printArray(Integer arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         Integer arr[]={3,2,4,5,1};
//         Arrays.sort(arr,Collections.reverseOrder());
//         printArray(arr);
//     }
// }


/*
reverse order with range , Arrays.sort(arr,startingIndex,endingIndex,Collection.reverseOrder())
 */

import java.util.Arrays;
import java.util.Collections;
public class inbuiltSortMethod{
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[]={3,2,4,5,1};
        Arrays.sort(arr,2,5,Collections.reverseOrder());
        printArray(arr);
    }
}

