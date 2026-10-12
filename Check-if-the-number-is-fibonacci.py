class Solution:
    def isFibonacci(self, n):
        # code here
        a,b = 0,1
        while a<n:
            a,b = b,a+b
        if a == n:
            return True
        else:
            return False
