package tut11BitManipulation;

/*  ************************************** update bit (zero or one) on ith position ********************

*/

public class tut4updateIthBit {
    public static void set_Zero_bit_On_Ith_Position(int number, int position) {
        int bitmask = 1 << position;
        int onesCompliment = ~bitmask;
        int result = number & onesCompliment;
        System.out.println(result);
    }

    public static void set_one_bit_On_Ith_Position(int number, int postion) {
        int bitmask = 1 << postion;
        int result = number | bitmask;
        System.out.println(result);
    }

    public static int clearBit(int n, int i) {
        int bitMask = 1 << i;
        int oncsCompliment = ~bitMask;
        int result = oncsCompliment & n;
        return result;
    }

    public static void main(String args[]) {
        int number = 10;
        int position = 1;
        int bit = 0;
        if (bit == 1) {
            set_one_bit_On_Ith_Position(number, position);

        } else {
            set_Zero_bit_On_Ith_Position(number, position);

        }

        // ******************** second way to update bit
        /*
         * 1. clear binary number on i position ,exa i = 1 .
         * exam ==> binary number of 10 is 00001010 , then remove bit from i position
         * from clearBit method . after clearBit method binary number is 00001000
         * 2. now we can set bit easily
         * 3. now set bit where we want set using this --> setBit<<position
         * 1<<1 --> 00000001<<1 , result is 00000010
         * 4. set bit in number using this --> getResult | setPosition;
         * 00001000 | 00000010 ==> 00001010
         */

        int getResult = clearBit(number, position);
        int setBit = 1;
        int setPosition = setBit << position;
        int getNewResult = getResult | setPosition;
        System.out.println(getNewResult);

    }

}
