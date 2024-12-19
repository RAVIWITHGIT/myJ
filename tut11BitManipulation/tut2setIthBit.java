package tut11BitManipulation;

// ******************************** set  bit in ith position in binary number ***********************
// set 1 bit in  binary number of  ith position

public class tut2setIthBit {
    public static void main(String args[]) {
        int number = 10;
        int postion = 2;
        int bitmask = 1 << postion;
        System.out.println(number | bitmask);
    }
}
