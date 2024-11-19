public class staircaseSearch{

    //starting from top right 
    // public static boolean StairCaseSearch(int arr[][],int getKey){
    //     int row = 0;
    //     int column = arr[0].length-1;
    //     while(row<arr.length && column>=0){
    //         if(arr[row][column]==getKey){
    //             System.out.printf("value found ( %d,%d )",row,column);
    //             return true;
    //         }else if(arr[row][column]<getKey){  
    //             row++;
    //         }else if(arr[row][column]>getKey){
    //             column--;
    //         }
    //     }
    //     System.out.println("value not found");
    //     return false;
    // }

    //staring from bottom left corner
    public static boolean StairCaseSearch(int arr[][],int getKey){
        int row = arr.length-1;
        int column = 0;
        while(row>=0 && column<arr[0].length){
            if(arr[row][column]==getKey){
                System.out.printf("value found ( %d,%d )",row,column);
                return true;
            }else if(arr[row][column]<getKey){  
                column++;
            }else if(arr[row][column]>getKey){
                row--;
            }
        }
        System.out.println("value not found");
        return false;
    }
    public static void main(String args[]){
         int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
     StairCaseSearch(matrix,11);                     
    }
}