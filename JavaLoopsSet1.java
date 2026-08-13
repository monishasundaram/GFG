class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int coutt = 0;
        for(int i = 0;i<=N;i++){
            if(i%2==0){
                count+=i;
            }
            else{
                coutt+=i;
            }
        }
        ans.add(count);
        ans.add(coutt);
        return ans;
    }
}
