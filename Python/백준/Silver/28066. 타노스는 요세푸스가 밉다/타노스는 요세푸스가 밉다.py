from collections import deque

n, k = map(int, input().split(' '))
dq = deque(range(1, n+1))

while(len(dq) != 1):
    dq.append(dq.popleft())
    for i in range(k-1):
        dq.popleft()
        if len(dq) == 1:
            break

print(dq.pop())