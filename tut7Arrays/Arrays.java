// public class Arrays{
//     public static void printPair(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         int myArr[] = {2,4,6,8,10};
//         printPair(myArr);

//     }
// }

// public class Array
// {
//     public static void substr(int arr[]){
//         int minValueSum = Integer.MAX_VALUE; 
//         int maxValueSum = Integer.MIN_VALUE; 
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     sum+=arr[k];
//                     System.out.print(arr[k]);
//                 }
//                 if(sum<minValueSum){
//                     minValueSum = sum;
//                 }else if(sum>maxValueSum){
//                     maxValueSum = sum;
//                 }
//                 sum = 0;
//                 System.out.print(" ");

//             }
//             System.out.println();
//         }
//         System.out.println(minValueSum);
//         System.out.println(maxValueSum);

//     }
// 	public static void main(String[] args) {
// 	   int arr[]={1,2,3,4,5};
// 	   substr(arr);
// 	}
// }

// ******************* find min max value

// public class Array
// {
//     public static void substr(int arr[]){
//         int minValueSum = Integer.MAX_VALUE; 
//         int maxValueSum = Integer.MIN_VALUE; 
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     sum+=arr[k];
//                     System.out.print(arr[k]);
//                 }
//                 if(sum<minValueSum){
//                     minValueSum = sum;
//                 }else if(sum>maxValueSum){
//                     maxValueSum = sum;
//                 }
//                 sum = 0;
//                 System.out.print(" ");

//             }
//             System.out.println();
//         }
//         System.out.println(minValueSum);
//         System.out.println(maxValueSum);

//     }
// 	public static void main(String[] args) {
// 	   int arr[]={1,2,3,4,5};
// 	   substr(arr);
// 	}
// }

// ************************ find max value first approach

/*
public class Array
{
    public static void substr(int arr[]){
        int maxValue =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]);
                }
                if(sum>maxValue){
                    maxValue=sum;
                }
                sum=0;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
        
    }
	public static void main(String[] args) {
	   int arr[]={1,2,3,4,5};
	   substr(arr);
	}
}
*/

// *************** second approach for find max value
// public class Array
// {
//     public static void substr(int arr[]){
//         int maxValue =Integer.MIN_VALUE;
//         int sum=0;
//         int prefix[] = new int[arr.length];
//         prefix[0]=arr[0];

//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+arr[i];
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 sum = i==0?prefix[j]: prefix[j]-prefix[i-1];
//                 if(sum>maxValue){
//                     maxValue=sum;
//                 }
//                 sum=0;
//             }
//         }
//         System.out.println(maxValue);

//     }
// 	public static void main(String[] args) {
// 	   int arr[]={1,2,3,4,5};
// 	   substr(arr);
// 	}
// }

// ****************************** trapping rainwater

// import java.util.*;

// public class Array{
//     public static int trapeRainWater(int height[]){
//         int n=height.length;
//         int leftMax[]= new int[n];
//         leftMax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(height[i],leftMax[i-1]);
//         }

//         int rightMax[] = new int[n];
//         rightMax[n-1] =height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMax[i] =Math.max(height[i],rightMax[i+1]);
//         }

//         int trapeWater=0;
//         for(int i=0;i<n;i++){
//             int waterLevel=Math.min(leftMax[i],rightMax[i]);
//             trapeWater+= waterLevel-height[i];
//         }
//         return trapeWater;
//     }
//     public static void main(String args[]){
//         int height[] ={4,2,0,6,3,2,5};
//         System.out.println(trapeRainWater(height));
//     }
// }

// *************** best time for buy and sell stock
// import java.util.*;

public class Arrays {
    public static void buyAndSellStock(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int sellingPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                sellingPrice = Math.max(sellingPrice, arr[i]);
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        System.out.println("max Profit " + maxProfit);
        System.out.println("buyPrice " + buyPrice);
        System.out.println("sellingPrice " + sellingPrice);

    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        buyAndSellStock(prices);
    }
}