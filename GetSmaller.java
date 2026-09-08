class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // your code 
        ArrayList<Integer> result = new ArrayList<>();

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < target) {
                        result.add(arr[i]);
                    }
                }

        return result;
    }
}
