class Solution:
    def countVowels(self, s: str, queries: list[list[int]]) -> list[int]:
        vowels = "aeiou"
        prefix = [0] * (len(s) + 1)

        for i in range(len(s)):
            prefix[i + 1] = prefix[i]
            if s[i] in vowels:
                prefix[i + 1] += 1

        ans = []

        for l, r in queries:
            ans.append(prefix[r + 1] - prefix[l])

        return ans
