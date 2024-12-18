package tut11BitManipulation;

/* *********************************************** Left Shift ****************************************
1. symbol of left shift is <<
2. 5<<2 ==> 00000101<<2 mean remove 2 number from left side 000101
3. add 2 zero in right side ==> 000101+00 ==> 0010100
4. trick => a*2^b , ^ mean power 
5. 5*2^2 is 20
 */

public class LeftShift {
    public static void main(String args[]) {
        System.out.println(5 << 2);
    }
}
