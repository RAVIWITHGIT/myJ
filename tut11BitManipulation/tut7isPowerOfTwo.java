package tut11BitManipulation;

/* **************************** check if a number is a power of 2 or not ****************************
1. if you perform & operator on even number  and evenNumber-1 then result always is 0
2 if perform &(and) operator on odd number and oddNumber-1 , then result is not 0
3. n is 7 , binary number of 7 is  00000111
4. n-1 binary number is --> 00000110
5. 00000111 & 00000110 --> 00000110 , not zero
6. if n is 6 --> 00000110 (6) & 00000101 (n-1==5) ==> 00000000
 
 */

public class tut7isPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(7));
        System.out.println(isPowerOfTwo(16));

    }
}
