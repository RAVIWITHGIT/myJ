package tut11BitManipulation;

/* **************************************** find bit of ith position ******************************
1. in binary we can only get 1 and 0 , so we can find 1 or 0 by, first 1<<i then n & (1<<i)
1.first 1<<i  -> i mean ith position
2 n & (1<<i)
 * 
 * 
 */

public class tut1getIthBit {
    public static void main(String args[]) {
        // find 0 or 1 bit from 2nd position of 00000101 (5) binary number
        int n = 5;
        int i = 2;
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
