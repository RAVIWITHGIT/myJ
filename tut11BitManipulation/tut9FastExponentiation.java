package tut11BitManipulation;

/*  ****************************** Fast way to find value of power  ************************************
1. create ans name variable which have 1 value
2. run loop until binary number (5 --> 00000011) of power not look like 00000000
3. find LSB of power using (power & 1) != 0
4. if condition is true mean LSB is 1
5. then multiply value with ans and update ans
6. square value and update value
7. get right shift binary number of power and update power --> power>>1;
 
 */

public class tut9FastExponentiation {
    public static int FastExponentiation(int value, int power) {
        int ans = 1;

        while (power > 0) {
            if ((power & 1) != 0) {
                ans = ans * value;
            }
            value = value * value;
            power = power >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(FastExponentiation(3, 5));
    }
}
