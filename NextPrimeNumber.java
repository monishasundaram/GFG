class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
            n++;

            while (true) {
                boolean prime = true;

                if (n < 2) {
                    prime = false;
                }

                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    return n;
                }

                n++;
        }
    }
}
