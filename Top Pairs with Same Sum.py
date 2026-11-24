
class Solution:
    def findPairs(self, arr):
        n = len(arr)
        groups = {}

        # Store all index pairs grouped by their sum
        for a in range(n):
            for b in range(a + 1, n):
                s = arr[a] + arr[b]
                if s not in groups:
                    groups[s] = []
                groups[s].append(a * n + b)

        # Build bitmasks for each sum
        masks = {}

        for s, pairs in groups.items():
            m = len(pairs)
            vm = {}

            for i, p in enumerate(pairs):
                a, b = divmod(p, n)
                bit = 1 << i

                vm[a] = vm.get(a, 0) | bit
                vm[b] = vm.get(b, 0) | bit

            masks[s] = (vm, (1 << m) - 1)

        # Search in lexicographical order
        count = {}

        for a in range(n):
            for b in range(a + 1, n):
                s = arr[a] + arr[b]

                pairs = groups[s]
                vm, all_bits = masks[s]

                i = count.get(s, 0)
                count[s] = i + 1

                # Only consider pairs appearing after (a, b)
                suffix = all_bits ^ ((1 << (i + 1)) - 1)

                blocked = vm[a] | vm[b]
                available = suffix & ~blocked

                if available:
                    bit = available & -available
                    j = bit.bit_length() - 1

                    c, d = divmod(pairs[j], n)
                    return [a, b, c, d]

        return [-1, -1, -1, -1]
