package tut11BitManipulation;

/* ****************************************** Clear Bit with range **********************************
1 I have got 10 number as n , which have 00001010 binary number 
2. Now i want clear bit from 2 to 4 range 
3. Index start from right to left, so output like this 00001010 ==> 0000010 (value is 2 of this binary)
4. if you want 00000010 binary number then you have 11100011 binary number and then use &(and) operator
5. 00001010 & 11100011 ==> 00000010 
6. if you want get 11100011 binary number , then divided this binary number in two part
    a. 11100000 , you get this binary number by (~0)<<(lastRange+1) , binary number of ~0 is 11111111
    b. 00000011 , you get this binary number by (1<<startIngIndex)-1 
7. 11100000 | 00000011 --> 11100011
8. 00001010 & 11100011 --> 00000010
9. value of 00000010 binary number is 2 , so get output is 2    
 
 */

public class tut6ClearRangeOfBits {

    public static int ClearBitsWithRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;

    }

    public static void main(String args[]) {
        System.out.println(ClearBitsWithRange(10, 2, 4));
    }
}
