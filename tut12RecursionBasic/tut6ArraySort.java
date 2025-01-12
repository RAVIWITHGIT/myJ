public class tut6ArraySort {

    /*
     * ************************************************************************
     * 1. call isSorted function from main method , isSorted function get two
     * argument . first --> arr , second --> starting point
     * 2. check if condition , this condition help to array that array not go out of
     * index , mean if index == arr.length-1 . so index reach last position of array
     * 3. second if condition check current index and next index value , if
     * current index value greater then next index value , mean array not sort . so
     * return false
     * 4. when first and second if condition not run mean index value is sorted
     * 5. so again call isSorted with array and upgraded index
     * 
     * 
     * ############################### code flow in call stack
     * 1. call isSorted function which present in main method
     * 2. store in stack
     * 3. check condition
     * 4. if condition not fulfilled , then again inner isSorted function call
     * 5. store again inner isSorted function is stack and run
     * 6, again check condition
     * 7. if condition not fulfilled , then again inner isSorted function call
     * 8. this process will continue until if condition fulfilled
     * 
     * 
     * ################################# code flow after in call stack , when reach
     * on base case
     * 1. when if condition fulfilled then return true or false
     * 2 . remove every function from call stack
     * 3. call stack follow first in last out
     * 4. this process will run from top to bottom in call stack
     * 
     */

    public static boolean isSorted(int arr[], int index) {
        // if i reach arr.length-1 then should stop because this is ending point of arr
        // , base case
        if (index == arr.length - 1) {
            return true;
        }

        // if arr[i]> arr[i+1] mean array is not sorted and return false
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(arr, 0));
    }
}
