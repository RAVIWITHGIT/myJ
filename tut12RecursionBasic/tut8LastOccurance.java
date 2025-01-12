public class tut8LastOccurance {

    // first way
    // public static int LastOccurance(int arr[], int key, int index) {
    // if (arr[index] == key) {
    // return index;
    // }
    // if (index == 0) {
    // return -1;
    // }

    // return LastOccurance(arr, key, index - 1);
    // }

    public static int LastOccurance2(int arr[], int key, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        int isFound = LastOccurance2(arr, key, index + 1);
        if (isFound == -1 && arr[index] == key) {
            return index;
        }

        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 5, 8, 9 };
        // System.out.println(LastOccurance(arr, 5, arr.length-1));
        System.out.println(LastOccurance2(arr, 5, 0));

    }
}
