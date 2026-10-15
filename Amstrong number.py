class Solution:
    def armstrongNumber(self, n):
        temp = n
        total = 0
        digits = len(str(n))

        while n > 0:
            dig = n % 10
            total = total + dig ** digits
            n = n // 10

        if total == temp:
            return True
        else:
            return False
