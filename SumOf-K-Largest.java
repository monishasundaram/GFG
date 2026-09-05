class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr);

                int sum = 0;

                for (int i = arr.size() - 1; i >= arr.size() - k; i--) {
                    sum += arr.get(i);
                }

                return sum;
    }
}
