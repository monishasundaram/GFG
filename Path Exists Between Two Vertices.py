class Solution:
    def checkPath(self, adj: list[list[int]], u: int, v: int) -> bool:
        visited = set()

        def dfs(node):
            if node == v:
                return True

            visited.add(node)

            for neighbor in adj[node]:
                if neighbor not in visited:
                    if dfs(neighbor):
                        return True

            return False

        return dfs(u)
