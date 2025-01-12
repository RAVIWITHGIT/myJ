public class tut3Factorial {

    /*
     * ******************************************** Factorial
     * ***********************************
     * 1. Factorial of n! is n*(n-1) , here this symbol represent to Factorial
     * 2. also apply base case condition , which help to stop this function
     * 
     * 
     * ################################### process
     * 1. call Factorial function and give 5 integer value as argument
     * 2. create a call stack in memory and function store in stack
     * 3. after calling , check if condition
     * 4. if condition false then reach int result = n * Factorial(n - 1); line
     * 5. before storing in result , variable n multiply Factorial(n - 1) , n==4
     * 6. mean again call Factorial function with n=4
     * 7. again check if condition
     * 8. again reach int result = n * Factorial(n - 1); line , n==3
     * 9. This process will continue until it finds the base case.
     * 10. after get base case , mean n==0 then if condition run and return 1
     * 
     * 
     * 
     * ######################### removing process in call stack
     * * 1. get n==0 , return 1;
     * 2. so remove from stack
     * 
     * 3. for n==1 code look like this --> 1 * Factorial(0)
     * 4. we have already got value from Factorial(0) , which have 1
     * 5. so int result = 1 * Factorial(0) ==> 1*1 and return 1;
     * 6. remove Factorial(1) from call stack
     * 
     * 7. reach Factorial(2) , which also look like this ==> int result = 2 *
     * Factorial(1)
     * 8. we know already completed Factorial(1) which return 1
     * 9. int result = 2 * Factorial(1) ==> 2* 1 and return 2;
     * 10.remove Factorial(2) from call stack
     * 
     * 11. reach Factorial(3) , which also look like this ==> int result = 3 *
     * Factorial(2)
     * 12. we know already completed Factorial(2) which return 2
     * 13. int result = 3 * Factorial(2) ==> 3* 2 and return 6;
     * 14. remove Factorial(3) from call stack
     * 
     * 15. reach Factorial(4) , which also look like this ==> int result = 4 *
     * Factorial(3)
     * 11. we know already completed Factorial(3) which return 6
     * 12. int result = 4 * Factorial(3) ==> 4* 6 and return 24;
     * 13.remove Factorial(4) from call stack
     * 
     * 10. reach Factorial(5) , which also look like this ==> int result = 5 *
     * Factorial(4)
     * 11. we know already completed Factorial(4) which return 24
     * 12. int result = 5 * Factorial(4) ==> 5* 24 and return 120;
     * 13. finish all code and out from the stack
     * 
     */

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = n * Factorial(n - 1);
        return result;

    }

    public static void main(String args[]) {
        System.out.println(Factorial(5));
    }
}
