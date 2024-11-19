public class DiagonalSum
{
    public static void diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               if(i==j){
                   sum+=arr[i][j];
               }else if(i+j==arr.length-1){
                   sum+=arr[i][j];
               }
               
            }
        }
        
        int sum2=0;
        // optamize solution 
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i][i];
            if(i!=arr.length-i-1){
                sum2+=arr[i][arr.length-i-1];
            }
            
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
	public static void main(String[] args) {
		int matrix[][]={{1,2,3,4},
		                {5,6,7,8},
		                {9,10,11,12},
		                {13,14,15,16}};
		             
		 diagonalSum(matrix);            
		}
	}