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

    public static void main(String args[]) {

        // Question 1 :What is the value of x^x (^ xor operator) for any value of x
        System.out.println(solveOne(4));

        // Question 2 :Swap two numbers without using any third variable
        swapValue(5, 2);
    }
}
