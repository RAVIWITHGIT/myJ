package tut11BitManipulation;

/* ****************************************** find odd even ***************************************
1. if we use and operator (&) in any number and 1 then give answer greater then zero and zero always
2. exam ==> 5 & 1 , in binary 00000101 & 00000001 ==> 00000001 (1)
3. exam ==> 6 & 1 , in binary 00000110 & 00000001 ==> 00000000 (0)
4. & operator ==> 0 & 0 --> 0 
 *                0 & 1 --> 0
 *                1 & 0 --> 0
 *                1 & 1 --> 1
 */

public class oddEven {
    public static void main(String args[]) {
        int bitMask = 1;
        int n = 4;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("number is odd");
        }
    }
}
