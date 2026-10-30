class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        if (a == b) {
        return 1;
        }

        if ((b - a) % c == 0 && (b - a) / c >= 0) {
            return 1;
        }

        return 0;
        }
}
