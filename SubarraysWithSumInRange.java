class Solution {

    private long countLessOrEqual(int[] arr, int k) {
        long count = 0;
        long sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public int countSubarray(int[] arr, int l, int r) {
        return (int)(countLessOrEqual(arr, r) - countLessOrEqual(arr, l - 1));
    }
}
