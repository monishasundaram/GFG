class Solution:
    def nthPosition (self, n):
        # code here 
        pos = 1
        while pos*2<=n:
            pos = pos*2
        return pos
