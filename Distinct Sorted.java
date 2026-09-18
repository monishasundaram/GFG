class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            if (arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
