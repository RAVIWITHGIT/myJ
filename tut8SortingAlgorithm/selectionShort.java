public class selectionShort{
    public static void sShort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minValue = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minValue]){
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,1,3,5};
        sShort(arr);
    }
}