class Solution:
    def posInfinite(self, s: str, pos: int) -> str:
        lengths = [len(s)]

        while lengths[-1] < pos:
            i = len(lengths)
            lengths.append(2 * lengths[-1] + i)

        for i in range(len(lengths) - 1, 0, -1):
            prev = lengths[i - 1]

            if pos > prev + i:
                pos = prev - (pos - prev - i) + 1
            elif pos > prev:
                return '$'

        return s[pos - 1]
