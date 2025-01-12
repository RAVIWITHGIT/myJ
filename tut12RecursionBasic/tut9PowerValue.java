public class tut9PowerValue {
    public static int PowerValue(int value, int power) {
        if (power == 1) {
            return value;
        }
        int result = value * PowerValue(value, power - 1);
        return result;

    }

    public static void main(String args[]) {
        System.out.println(PowerValue(2, 5));
    }
}
