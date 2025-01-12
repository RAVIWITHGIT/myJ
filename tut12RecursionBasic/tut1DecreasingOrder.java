
public class tut1DecreasingOrder {
    /*
     * **************************recursion work in 3 step
     * 1. first we will decide where this function stop , mean decide base case
     * 2. what will this function do , mean Recursive Case
     * 3. Function Call,
     * 
     * Analysis output ==>
     * 1.when function call another function , then in memory create call stack
     * 
     * 2. call DecreasingOrder function in main function , which store in stack .
     * a. after call first check n==1 , if true then print n and return
     * b. if condition false then print n , and call inner function with n-1 value;
     * 
     * 3. inner function store in stack
     * a. check n==1 , if true then print n and return
     * b. if condition false then print n , and call inner function with n-1 value;
     * 
     * 4. when inner function store in stack with 1 value
     * a. first check n==1 , if true then print n and return
     * b. after return , remove from stack and other function also follow this step
     * and remove from stack
     * 
     * 5. so call stack follow first in and last out (FILO)
     */
    public static void DecreasingOrder(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        DecreasingOrder(n - 1);
    }

    public static void main(String args[]) {
        DecreasingOrder(10);
    }
}
