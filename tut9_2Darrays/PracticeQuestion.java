
/*
public class PracticeQuestion{
    public static void countNumber(int arr[][],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    public static void main(String args[]){
        int arr[][] = {{4,7,8},{8,8,7}};
        countNumber(arr,8);
    }
}
*/

/*
public class PracticeQuestion{
    public static void getSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr[1].length;i++){
            sum+=arr[1][i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        getSum(arr);
    }
}
*/

// public class PracticeQuestion{
//     public static void TransposeOfMatrix(String arr[][]){
//         int row=arr.length;
//         int column=arr[0].length;
        
//         String newArray[][]= new String[column][row];

//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 newArray[j][i]=arr[i][j];
//             }
            
//         }
        
//         for(int i=0;i<newArray.length;i++){
//           System.out.println(newArray[i][0]+" "+newArray[i][1]);
//         }
        
//     }
//     public static void main(String args[]){
//         String arr[][]={{"a11","a12","a13"},{"a21","a22","a23"}};
//         TransposeOfMatrix(arr);
//     }
// }