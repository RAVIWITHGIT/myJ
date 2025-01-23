public class T1MergeSort {
    public static void printArray(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index++]);
        printArray(arr, index);
    }

    public static void mergeSort(int arr[], int startingPoint, int endingPoint) {
        if (startingPoint >= endingPoint) {
            return;
        }
        int mid = startingPoint + (endingPoint - startingPoint) / 2;
        mergeSort(arr, startingPoint, mid); // for left part
        mergeSort(arr, mid + 1, endingPoint); // for right part
        merge(arr, startingPoint, endingPoint, mid);
    }

    public static void merge(int arr[], int s1, int e1, int mid) {
        int temp[] = new int[e1 - s1 + 1];
        int i = s1; // index for first sorted part
        int j = mid + 1; // index for 2nd sorted part
        int k = 0; // index for tem;

        while (i <= mid && j <= e1) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 2nd sorted part
        while (j <= e1) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = s1; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 3, 4 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr, 0);
    }
}
