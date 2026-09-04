class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String m = s1+s2;
        String rev = "";
        for(int i = m.length()-1;i>=0;i--){
            rev = rev + m.charAt(i);
        }
        return rev;
    }
}
