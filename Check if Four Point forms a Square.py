class Solution:
    def isSquare(self, points):    
        #code here
        dis = []
        for i in range(4):
            for j in range(i+1, 4):
                x1, y1 = points[i]
                x2, y2 = points[j]

                d = (x2-x1)**2 + (y2-y1)**2
                dis.append(d)

        dis.sort()

        return (dis[0] > 0 and
                dis[0] == dis[1] == dis[2] == dis[3] and
                dis[4] == dis[5] and
                dis[4] == 2 * dis[0])
