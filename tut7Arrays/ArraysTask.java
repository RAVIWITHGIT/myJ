/*
 * There is an integer array nums sorted in ascending order (with distinct
 * values).Prior to being passed to your function, nums is possibly rotated at
 * an unknown pivot index k (1 <= k < nums.length) such that the resulting array
 * is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
 * and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.You
 * must write an algorithm with O(log n) runtime complexity
 * 
 */

// public class ArraysTask {
// public static int search(int[] nums, int target) {
// // min will have index of minimum element of nums
// int min = minSearch(nums);
// System.out.println(min);
// // find in sorted left
// if (nums[min] <= target && target <= nums[nums.length - 1]) {
// return search(nums, min, nums.length - 1, target);
// }
// // find in sorted right
// else {
// return search(nums, 0, min, target);
// }
// }

// // binary search to find target in left to right boundary
// public static int search(int[] nums, int left, int right, int target) {
// int l = left;
// int r = right;
// // System.out.println(left+" "+right);
// while (l <= r) {
// int mid = l + (r - l) / 2;
// if (nums[mid] == target) {
// return mid;
// } else if (nums[mid] > target) {
// r = mid - 1;
// } else {
// l = mid + 1;
// }
// }
// return -1;
// }

// // smallest element indexpublic
// public static int minSearch(int[] nums) {
// int left = 0;
// int right = nums.length - 1;
// while (left < right) {
// int mid = left + (right - left) / 2;
// if (mid > 0 && nums[mid - 1] > nums[mid]) {
// return mid;
// } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
// left = mid + 1;
// } else {
// right = mid - 1;
// }
// }
// return left;
// }

// public static void main(String args[]) {
// // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
// // int arr[] = { 50, 10, 20, 30, 40 };
// int arr[] = { 30, 40, 50, 10, 20 };
// ;
// int findNum = 5;
// System.out.println(search(arr, findNum));
// }
// }

/*
 * Q3. You are given an array prices where prices[i] is the price of a given
 * stock on the ith day.Return the maximum profit you can achieve from this
 * transaction. If you cannot achieve any profit, return 0
 * 
 */

// import java.util.*;

// public class ArraysTask{
// public static int maxProfit(int arr[]){
// int buyPrice = arr[0];
// int sellingPrice = Integer.MIN_VALUE;
// int maxProfit = 0;
// for(int i=1; i<arr.length; i++){
// if(arr[i]>buyPrice){
// int profit = arr[i]-buyPrice;
// sellingPrice = Math.max(arr[i],sellingPrice);
// maxProfit = Math.max(maxProfit,profit);
// }else{
// buyPrice = arr[i];
// }

// }
// System.out.println("buyprice "+buyPrice);
// System.out.println("sellingPrice "+sellingPrice);
// return maxProfit;
// }
// public static void main(String args[]){
// int arr[]= {7,1,5,3,6,4};
// System.out.println(maxProfit(arr));
// }
// }

/*
 * Q4. Given n non-negative integers representing an elevation map where the
 * width of each bar is 1, compute how much water it can trap after raining.
 */

// import java.util.*;

public class ArraysTask {
    public static int trapWater(int arr[]) {
        int leftHight[] = new int[arr.length];
        int rightHight[] = new int[arr.length];
        int totalTrap = 0;

        leftHight[0] = arr[0];
        rightHight[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            leftHight[i] = Math.max(leftHight[i - 1], arr[i]);
        }
        for (int i = arr.length - 2; i > -1; i--) {
            rightHight[i] = Math.max(rightHight[i + 1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int minHight = Math.min(leftHight[i], rightHight[i]);
            totalTrap += (minHight - arr[i]) * 1;
        }
        return totalTrap;

    }

    public static int trap(int height[]) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;

    }

    public static void main(String args[]) {
        int hight[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trapWater(hight));
        System.out.println(trap(hight));

    }
}

/*
 * Question 5:Given an integer array nums, return all the triplets [nums[i],
 * nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j]
 * + nums[k] == 0.Notice that the solution set must not contain duplicate
 * triplets.
 * Example 1:
 * Input: nums = [-1, 0, 1, 2, -1, -4]
 * Output: [ [-1, -1, 2] , [-1, 0, 1] ]
 * 
 */

// public class ArraysTask{
// public static void print2dArray(int arr[]){
// int narr[][] = new int [arr.length-2][3];
// int index = 0;
// for(int i=0; i<arr.length-2; i++){
// for(int j=i+1; j<arr.length-1; j++){
// for(int k=i+2; k<arr.length; k++){
// if((arr[i]+arr[j]+arr[k])==0){
// System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
// narr[index][0] = arr[i];
// narr[index][1] = arr[j];
// narr[index][2] = arr[k];
// index++;
// }

// }
// }

// }
// System.out.println(narr.length);
// for(int i=0; i<narr.length; i++){
// for(int j=0; j<3; j++){
// System.out.print(narr[i][j]);
// }
// System.out.println();
// }
// }
// public static void main(String args[]){
// int nums[] = {-1, 0, 1, 2, -1, -4};
// print2dArray(nums);
// }
// }