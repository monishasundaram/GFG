class Solution {
    public int nthDay(int d, int n) {
        // code here
        return(d-(n%7)+7)%7;
    }
}
