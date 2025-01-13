public class tut9PowerValue {
    public static int PowerValue(int value, int power) {
        if (power == 1) {
            return value;
        }
        int result = value * PowerValue(value, power - 1);
        return result;

    }

    public static int PowerValue2(int value, int power) {
        if (power == 0) {
            return 1;
        }
        int halfPower = PowerValue2(value, power / 2);
        int halfPowerSquare = halfPower * halfPower;

        if (power % 2 != 0) {
            halfPowerSquare = 2 * halfPowerSquare;

        }

        return halfPowerSquare;

    }

    public static void main(String args[]) {
        System.out.println(PowerValue(2, 5));
        System.out.println(PowerValue2(2, 5));
        System.out.println(1 % 2);
    }
}
