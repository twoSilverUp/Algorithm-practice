from collections import deque

n = int(input())
toPop = list(map(int, input().split()))
balloons = deque(range(1,n+1))

while(len(balloons) > 1):
    balloon = balloons.popleft()
    print(balloon, end=' ')
    if(toPop[balloon-1]>0):
        balloons.rotate(-toPop[balloon-1]+1)
    else:
        balloons.rotate(-toPop[balloon-1])

print(balloons.pop())





