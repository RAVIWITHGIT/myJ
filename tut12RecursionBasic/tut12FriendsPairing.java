
/* ************************************* Friends pairing problem ************************************
given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. find out the total number of ways in which friends can remain single or can be paired up.

i am not understanding how this code run  , so again discuss in future
 
 */

public class tut12FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendsPairing(n - 1);

        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }

}
