package tut11BitManipulation;

public class tut10PracticeQuestion {
    public static int solveOne(int n) {
        return n ^ n;
    }

    public static void swapValue(int f, int s) {
        System.out.println("before swapping " + f + " " + s);
        f = f ^ s;
        s = f ^ s;
        f = f ^ s;
        System.out.println("after swapping " + f + " " + s);
        System.out.println(~5);

    }

    /*
     * ***************************************** solution of 3 question
     * 1.positive number(6) +1 ==> 000000110+000000001 --> 0000000111 which
     * represent to 7
     * 2. negative number (-4)+1 ==>
     * **I. -4 in binary number
     * ***** a. -4 represent two's compliment
     * ***** b. one's compliment --> 11111011
     * ***** c. add 1 --> 11111011 + 00000001 ==> 11111100
     * 
     * **II. add 1 in -4 ==> -4+1
     * ***** a. 11111100(-4) + 00000001 ==> 11111101
     * ***** b. 11111101 have 1 in MSB , so again get two's compliment this
     * ***** c. one's compliment --> 11111101 ==> 00000010
     * ***** d. add 1 (this is step of twe's compliment) --> 00000010 + 00000001
     * ==>00000011
     * ***** e. 00000011 represent to 3 , but 11111100(-4) + 00000001(1) ==>
     * 11111101
     * ,
     * *****which have 1 in MSB
     * ***** f. result is -3
     * 
     */
    public static void addValue() {
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);

    }

    /*
     * ****************************************** solution 4
     * 1.A represent to 65 in integer
     * 2. if we can 32 in 65 then get value is 97
     * 3. 97 represent to a
     * 4. mean if I add 32 in any upperCase character then get lowercase value
     * 5. In ASCII TABLE space represent to 32
     * 
     */
    public static void UpperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }

    public static void main(String args[]) {

        // Question 1 :What is the value of x^x (^ xor operator) for any value of x
        System.out.println(solveOne(4));

        // Question 2 :Swap two numbers without using any third variable
        swapValue(5, 2);

        // Question 3 :Add 1 to an integer using Bit Manipulation. (Hint: try using
        // Bitwise NOT Operator)
        addValue();

        // Question 4 :This question is based on a trick, Convert uppercase characters
        // to lowercase using bits
        UpperToLower();
    }
}
