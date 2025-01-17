/* ******************************** step of Recursion
1. base case
2. what do
3. call inner function
 
 */

/* ****************************************** Tiling Problem ******************************************
Given a "2xn" board and tiles of size "2x1", count the number of ways t tile the given board using the 2x1 tiles. (A tile can either be placed horizontally or vertically.)


1. here n is 3 , mean floor size 2x3
2. we discuss how many way adjust tile in floor
3. 

*/

public class tut10TilingProblem {
    public static int tilingProblem(int n) {

        // ****************** base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // **************************** what do
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(3));
    }
}
