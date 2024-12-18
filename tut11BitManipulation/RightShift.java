package tut11BitManipulation;

/* *********************************************** right Shift ****************************************
1. symbol of right shift is >>
2. 5>>1 ==> 00000101>>2 mean remove 1 number from right side 000000010
3. add 1 zero in left side ==> 0+00010 ==>  00000010 which is 2
4. trick => a/2^b , ^ mean power 
5. 5/2^1 is 2
 */

public class RightShift {
    public static void main(String args[]) {
        System.out.println(5 >> 1);
    }
}
