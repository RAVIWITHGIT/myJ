/*
This is another way of using sort array. And it is applicable on normal positive numbers. And it is applicable on numbers whose range is less like 0 to 30 , 0 to 100 , 0 to 50
 */


public class countingSort{
    public static void Counting(int arr[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxValue = Math.max(maxValue,arr[i]);
        }
        int countArray[] = new int[maxValue+1];
        for(int i=0; i<arr.length; i++){
            countArray[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                arr[j]=i;
                j++;
                countArray[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // for(int i=0; i<countArray.length; i++){
        //     System.out.println(countArray[i]);
        // }


    }
    public static void main(String args[]){
        int arr[] = {2,1,3,5,4};
        Counting(arr);
    }
}