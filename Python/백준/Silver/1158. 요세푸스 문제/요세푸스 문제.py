from collections import deque

n, k = map(int, input().split(' '))
circle = deque(range(1, n+1))
print('<', end='')

while(len(circle) != 1):
    circle.rotate(-k+1)
    print(circle.popleft(), end=', ')

print(circle.pop(), end='>')