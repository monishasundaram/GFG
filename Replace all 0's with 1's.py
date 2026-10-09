class Solution:
    def convertFive(self, n):
        # code here
        if n == 0:
            return 5
        res = 0
        pls = 1
        while n>0:
            dig = n%10
            if dig%10 == 0:
                dig = 5
            res = res + dig*pls
            pls = pls*10
            n //= 10
        return res
