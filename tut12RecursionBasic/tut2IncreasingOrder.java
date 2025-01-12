public class tut2IncreasingOrder {

    /*
     * *****************************************************************************
     * ********
     * 1. call IncreasingOrder function and give 5 integer value as argument
     * 2. create a call stack in memory and function store in stack
     * 3. after calling check if condition
     * 4. if condition false then again call IncreasingOrder() with n-1 value
     * 5. then again store in stack
     * 6. check if condition
     * 7. if condition false then again call IncreasingOrder() with n-1 value
     * 8. This process will continue until it finds the base case.
     * 9. after get base case , mean n==1 then if condition run and print n which is
     * ===>1
     * 10. after print n return from this function
     * 
     * 
     * removing process in call stack
     * 1. get n==1 , then print n===> 1 and return
     * 2. so remove from stack
     * 3. then reach IncreasingOrder(2) , which have store IncreasingOrder(n-1) , so
     * IncreasingOrder(n-1) already finish , so run next line which is print
     * statement . print n===> 2
     * 4. after run all code of IncreasingOrder(2) , then remove from stack
     * 5. then reach IncreasingOrder(3) , which have store IncreasingOrder(2) , so
     * IncreasingOrder(2) already finish , so run next line which is print
     * statement.print n===> 2
     * 6. after run all code of IncreasingOrder(3) , then remove from stack
     * 7. This process will continue until it reaches the bottom of the call stack
     * 
     * 
     * 
     */
    public static void IncreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        IncreasingOrder(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {
        IncreasingOrder(5);
    }
}
