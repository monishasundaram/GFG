class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if (n == 1 || n == 2)
            return n;

        int mod = 1000000007;

        long a = 1;
        long b = 2;

        for (int i = 3; i <= n; i++) {
            long c = (b + (i - 1) * a) % mod;
            a = b;
            b = c;
        }

        return (int) b;
    }
}
