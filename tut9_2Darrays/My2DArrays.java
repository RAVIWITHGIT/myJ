import java.util.*;

public class My2DArrays{
    public static void findLargest(int matrix[][]){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]>maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }

    public static void findMinimum(int matrix[][]){
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<minValue){
                    minValue = matrix[i][j];
                }
            }
        }
        System.out.println(minValue);
    }
    public static boolean findNumber(int matrix[][],int targetNumber){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==targetNumber){
                    System.out.println("( "+i+","+j+" )");
                    return true;

                }
            }
        }
            return false;
    }
    public static void main(String args[]){

        //**************  3 row and 4 column
        int arr[][] = new int[3][4];

        //************ you can find total row use arr.length and find total column arr[0].length
        int rowLength = arr.length;
        int columnLength = arr[0].length; 
        Scanner sc = new Scanner(System.in);
        for(int row=0; row<rowLength; row++){
            for(int column=0; column<columnLength; column++){
                arr[row][column] = sc.nextInt();
            }
        }


        for(int row=0; row<rowLength; row++){
            for(int column=0; column<columnLength; column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
        findNumber(arr,6);
        findLargest(arr);
        findMinimum(arr);
    }
}