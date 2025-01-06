package tut11BitManipulation;

/*
 1.discuss about how to remove bit from last by Ith position , mean if n is 15 and i is 2 then
   I. binary number of 15 is --> 00001111 and Ith position is 2
   II. after remove last 2 bit from last --> 00001100

 2. i have one way to convert 1 bit to 0 , by &(and) bit operator and also i should have binary number which have 0 bit on i position like( here i is 2 ,so --> 11111100 , result 00001111 & 11111100 -->  11111100 )  

 3. mean i should 11111111 like binary number and then swift bit by position
 4. ~0 and -1 have this binary number 
 5 use (~0 or -1) this we can swift bit by Ith position
 6. (~0) << 2 (mean last 2 position  bit swift ) --> 11111111<<2 ==> 11111100
 7. 11111100 & 00001111 ==> 00001100 


 */

public class tut5ClearLastIthBits {
    public static int ClearIBits(int n, int position) {
        int bitMask = (~0) << position;
        return n & bitMask;
    }

    public static void main(String args[]) {
        int result = ClearIBits(15, 2);
        System.out.println(result);
    }
}
