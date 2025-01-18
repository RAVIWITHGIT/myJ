
/* ************************************************ Binary String Problem ***************************
Question. Print all binary strings of size n without consecutive ones (consecutive ones mean not repeat one in binary string)
 * 
 */

public class tut13BinaryString {
    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // work
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String args[]) {
        printBinaryString(3, 0, "");
    }
}
