package tut11BitManipulation;

//************************************** clear bit on ith position *********************************
// mean remove 1 bit on ith position in binary number 
/*
1. get 1 on ith position ==> 1<<i  , exa --> 00000001<<1 is 00000010
2. after get one's compliment of ~(1<<i) , exa --> 11111101
3. number & ~(1<<i) , exa --> 00001010 (10) & 11111101 , result --> 00001000 
4 . before clear bit of 1 position --> 00001010
5 . after clear bit of 1 position --> 00001000

1. get 1 on ith position ==> 1<<i  , exa --> 00000001<<2 is 00000100
2. after get one's compliment of ~(1<<i) , exa --> 11111011
3. number & ~(1<<i) , exa --> 00001010 (10) & 11111011 , result --> 00001011
4 . before clear bit of 2 position --> 00001010
5 . after clear bit of 2 position --> 00001010
 */

public class tut3clearIthBit {
    public static void main(String args[]) {
        int position = 1;
        int bitmask = ~(1 << position);
        System.out.println(10 & bitmask);
    }

}
