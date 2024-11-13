/* ************************************ bubble sort 
// public class Task{
//     public static void bubbleSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){ 
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
            
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         bubbleSort(arr);
//     }
// }
*/



/* ******************** selection sort
public class Task
{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp =arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		int arr[]={3,6,2,1,8,7,4,5,3,1};
		selectionSort(arr);
	}
	
}

*/





/* ************************************** insertionSort
 */


// public class Task{
//     public static void insertionSort(int arr[]){
//         for(int i=1; i<arr.length;i++){
//             int current = arr[i];
//             int previous = i-1;
//             while(previous>=0 && arr[previous]>current){
//                 arr[previous+1] = arr[previous];
//                 previous--;
//             }
//             arr[previous+1] = current;

//         }


//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         insertionSort(arr);

//     }
// }