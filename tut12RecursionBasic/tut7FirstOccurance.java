public class tut7FirstOccurance {
    public static int FirstOccurance(int arr[], int index, int findValue) {
        if (arr[index] == findValue) {
            return index;
        }
        if (index == arr.length - 1) {
            return -1;
        }

        return FirstOccurance(arr, index + 1, findValue);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 3, 4, 5, 6, 7 };
        System.out.println(FirstOccurance(arr, 0, 5));
    }
}
