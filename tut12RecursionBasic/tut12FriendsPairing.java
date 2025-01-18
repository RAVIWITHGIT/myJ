
/* ************************************* Friends pairing problem ************************************
given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. find out the total number of ways in which friends can remain single or can be paired up.

i am not understanding how this code run  , so again discuss in future
 
 */

public class tut12FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single -->3-1 is 2 . so memeber is 2 a,b , so these can stand along and stand
        // in pair ,
        // that why give 2
        int fnm1 = friendsPairing(n - 1);

        // pair
        int fnm2 = friendsPairing(n - 2);
        System.out.println(fnm1 + " fnm1");
        System.out.println(fnm2 + " fnm2");
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }

}
