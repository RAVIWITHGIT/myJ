// public class bubbleShort {
//     public static void bubbleSort(int arr[]) {
//         int swap = 0;
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i]>arr[i+1]){
//                 swap++;
//             }
//         }

//         if(swap>0){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length - i-1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 1, 5, 3, 4 };
//         int arr2[] = {1,2,3,4,5 };
//         bubbleSort(arr);
//         bubbleSort(arr2);
//     }
// }



// ****************************************** if array already sorted
// public class sortingAlgorithm {

//     public static void bubbleSort(int arr[]) {
//         boolean swapped;
//         int swap = 0;
        
//         for (int i = 0; i < arr.length - 1; i++) {
//             swapped = false;  // Flag to track if any swap occurs in the inner loop
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // Swap elements if they are in the wrong order
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swap++;
//                 }
//             }
//             // If no elements were swapped in the inner loop, array is sorted and value is zero
            
//             if (swap==0) {
//                 break;
//             }
//         }

//         // Print sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         //int arr[] = {2, 1, 5, 3, 4};
//         int arr[]={1,2,3,4,5};
//         bubbleSort(arr);  // Call optimized bubbleSort
//     }
// }
