public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println("GCD of 25 and 15: " + getGreatestCommonDivisor(25, 15));   // 5
        System.out.println("GCD of 12 and 30: " + getGreatestCommonDivisor(12, 30));   // 6
        System.out.println("GCD of 9 and 18: " + getGreatestCommonDivisor(9, 18));     // -1 (invalid case)
        System.out.println("GCD of 81 and 153: " + getGreatestCommonDivisor(81, 153)); // 9
        System.out.println("GCD of 101 and 103: " + getGreatestCommonDivisor(101, 103)); // 1
        System.out.println("GCD of 100 and 25: " + getGreatestCommonDivisor(100, 25)); // 25
    }
}
