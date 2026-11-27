class Solution:
    def countEdges(self, adj: list[list[int]]) -> int:
        # code here
        count = 0

        for i in range(len(adj)):
            count += len(adj[i])

        return count // 2
