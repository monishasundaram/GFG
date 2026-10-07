class Solution:
    def primePairs(self, n):
        
        def is_prime(num):
            if num < 2:
                return False
            
            for i in range(2, int(num ** 0.5) + 1):
                if num % i == 0:
                    return False
            
            return True
        
        primes = []

        for i in range(2, n + 1):
            if is_prime(i):
                primes.append(i)

        ans = []

        for p in primes:
            for q in primes:
                if p * q <= n:
                    ans.append(p)
                    ans.append(q)

        return ans
