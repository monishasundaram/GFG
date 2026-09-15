import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        // code here
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return a;
    }
}
