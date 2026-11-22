class Solution:
	def longestSubarrayDivK(self,arr, k):
        prefix_sum = 0
        max_length = 0

        remainder_index = {0: -1}

        for i in range(len(arr)):
            prefix_sum += arr[i]

            remainder = prefix_sum % k

            if remainder in remainder_index:
                max_length = max(max_length, i - remainder_index[remainder])
            else:
                remainder_index[remainder] = i

        return max_length
		
