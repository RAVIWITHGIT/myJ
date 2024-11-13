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


/*  ************************************** bubbleSort 
*/
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