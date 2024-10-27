from collections import deque


n = int(input())
pushPop = ''
stack = deque()
done = True
lastNum = 0

for i in range(n):
    elem = int(input())
    last = stack.pop() if len(stack) > 0  else 0

    if(last>elem):
        done = False
        break
    
    stack.append(last)
    for j in range(lastNum+1, elem+1):
        pushPop += '+\n'
        stack.append(j)
        lastNum = j
    
    pushPop +='-\n'
    stack.pop()


if done:
    print(pushPop)
else:
    print('NO')