
public class tut1DecreasingOrder {
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
