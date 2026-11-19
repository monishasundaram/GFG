class Solution:
    def sortIt(self, arr):
        odd = []
        even = []

        for x in arr:
            if x % 2 == 1:
                odd.append(x)
            else:
                even.append(x)

        odd.sort(reverse=True)
        even.sort()

        arr[:] = odd + even
