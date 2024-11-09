public class insertionSort
{
    public static void iShort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    int arr[]={2,1,5,3,4};
	    iShort(arr);

}
}