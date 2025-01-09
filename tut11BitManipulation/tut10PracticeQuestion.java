package tut11BitManipulation;

public class tut10PracticeQuestion {
    public static int solveOne(int n) {
        return n ^ n;
    }

    public static void main(String args[]) {

        // Question 1 :What is the value of x^x (^ xor operator) for any value of x
        System.out.println(solveOne(4));
    }
}
