class Solution {
    int ans = Integer.MAX_VALUE;

    void solve(int[] arr, int index, int product, boolean taken) {
        if (index == arr.length) {
            if (taken) {
                ans = Math.min(ans, product);
            }
            return;
        }

        solve(arr, index + 1, product * arr[index], true);

        solve(arr, index + 1, product, taken);
    }

    public int minProd(int[] arr) {
        solve(arr, 0, 1, false);
        return ans;
    }
}