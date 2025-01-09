package tut11BitManipulation;

/* ******************************** count total 1 bit in an binary number ***************************
 Least Significant Bit (LSB) --> the LSB is the rightmost bit in binary number

1. find LSB of 1010 (10) by using n & 1 --> 00001010 & 00000001 ==> 00000000 , LSB is 0
2.  right shift binary number --> n>>1 ==> 00001010 >> 1 is 00000101
3. then again find LSB BY n & 1 --> 00000101 & 00000001 ==> 00000001 , LSB is 1
4. then right shift binary number using n>>1 --> 00000101 >> 1 ==> 00000010
 */

public class tut8CountSetBit {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(10));
    }

}
