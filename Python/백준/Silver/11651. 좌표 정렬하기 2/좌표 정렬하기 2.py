class Location:
    def __init__(self, x, y):
        self.x = x
        self.y = y

n = int(input())
points = []

for _ in range(n):
    point = input().split()
    points.append(Location(int(point[0]), int(point[1])))

points.sort(key= lambda x:x.x)
points.sort(key= lambda x:x.y)

for point in points:
    print(point.x, point.y)