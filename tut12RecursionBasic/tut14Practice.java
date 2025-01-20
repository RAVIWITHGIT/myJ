public class tut14Practice {

    /*
     * ************************************** Question 2
     * You are given a number (eg - 2019), convert it into a String of
     * english like“two zero one nine”. Use a recursive function to solve this
     * problem.NOTE-The digits of the number will only be in the range 0-9 and the
     * last digit of a number can’t be 0
     * 
     * Sample Input: 1947
     * Sample Output: “one nine four seven”
     */

    public static void Question2(String arr[], int num, String newStr) {
        if (num == 0) {
            System.out.println(newStr);
            return;
        }
        int lastNumber = num % 10;
        int newNumber = num / 10;
        newStr = arr[lastNumber] + newStr;
        Question2(arr, newNumber, newStr);
        // return "";
    }

    // **************************************************** this is real Answer of
    // Question2
    public static void printDigits(int number, String digits[]) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10, digits);
        System.out.print(digits[lastDigit] + " ");
    }

    /*
     ***************************************************** Question 3 :
     * Write a program to find Length of a String using Recursion
     * 
     */

    public static void Question3(String str, String newStr, int index) {
        if (str.equals(newStr)) {
            System.out.println("the length of this String is " + index);
            return;
        }
        newStr = newStr + str.charAt(index);
        index = index + 1;
        Question3(str, newStr, index);
        // System.out.println(str.charAt(4));
    }

    public static void main(String args[]) {

        // ******************************************* Question 2
        // String arr[] = { " zero ", " one ", " two ", " three ", " four ", " five ", "
        // six ", " seven ", " eight ",
        // " nine " };
        // int num = 2019;
        // Question2(arr, num, "");
        // printDigits(num, arr);

        // *************************************** Question 3
        Question3(new String("ravi lakshakar"), "", 0);
    }
}