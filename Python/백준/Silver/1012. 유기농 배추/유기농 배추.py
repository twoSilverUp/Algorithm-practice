def bfs(i, j):
    move = [(1,0),(0,1),(-1,0),(0,-1)]
    global visited
    queue = [(i, j)]
    visited[i][j]=True
   
    while len(queue)!=0:
        index = queue.pop(0)
        for k in move:
            if(k[0]+index[0]<0 or k[0]+index[0]>=n or k[1]+index[1]<0 or k[1]+index[1]>=m):
                continue
            if(field[k[0]+index[0]][k[1]+index[1]]==1 and not visited[k[0]+index[0]][k[1]+index[1]]):
                queue.append((k[0]+index[0], k[1]+index[1]))
                visited[k[0]+index[0]][k[1]+index[1]] = True


t = int(input())

for _ in range(t):
    m, n, k = map(int, input().split())
    field = [[0 for _ in range(m)] for _ in range(n)]
    for _ in range(k):
        i, j = map(int, input().split())
        field[j][i] = 1
    
    worms = 0
    visited = [[False for _ in range(m)] for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if(field[i][j]==1 and not visited[i][j]):
                bfs(i, j)
                worms+=1
    print(worms)