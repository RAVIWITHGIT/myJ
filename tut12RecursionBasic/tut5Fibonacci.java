public class tut5Fibonacci {

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int result = Fibonacci(n - 1) + Fibonacci(n - 2);
        return result;
    }

    public static void main(String args[]) {
        System.out.println(Fibonacci(5));
    }
}
