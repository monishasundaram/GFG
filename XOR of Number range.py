class Solution:
    def findXOR(self, l: int, r: int) -> int:
        # code here
        def xoe(n):
            if n%4==0:
                return n
            elif n%4==1:
                return 1
            elif n%4==2:
                return n+1
            else: return 0
            
        return xoe(r)^xoe(l-1)
            
