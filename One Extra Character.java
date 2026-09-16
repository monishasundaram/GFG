class Solution {
    public char extraChar(String s1, String s2) {
        // code here
        int[] count = new int[26];

                // Add characters of s1
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

                // Remove characters of s2
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

                // Find the character with count 1 or -1
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return (char)(i + 'a');
            }
        }

        return ' ';
    }
}
