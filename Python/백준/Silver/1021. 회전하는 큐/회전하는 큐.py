from collections import deque

n, m = map(int, input().split(' '))
toPop = map(int, input().split(' '))

dq = deque(range(1, n+1))

oper = 0
for i in toPop:
    size = len(dq)
    idx = dq.index(i)
    if (idx > int(size/2)):
        dq.rotate(size-idx)
        oper += (size-idx)
        dq.popleft()

    else:
        dq.rotate(-idx)
        oper += idx
        dq.popleft()


print(oper)