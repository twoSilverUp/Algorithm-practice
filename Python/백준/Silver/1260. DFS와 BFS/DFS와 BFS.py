def dfs(edges, start):
    global visitedD
    visitedD.append(start)
    for i in range(len(edges)):
        if edges[start][i]==1 and visitedD.count(i)==0:
            dfs(edges, i)


def bfs(edges, start):
    visited = []
    queue = []
    visited.append(start)
    queue.append(start)

    while len(queue)!=0:
        vertex = queue.pop(0)
        for i in range(len(edges)):
            if(edges[vertex][i]==1 and visited.count(i)==0):
                visited.append(i)
                queue.append(i)
    
    for i in visited:
        print(i+1, end=" ")
        


n, m, v = map(int, input().split())
edges = [[-1 for _ in range(n)] for _ in range(n)]
visitedD = []

for _ in range(m):
    i, j = map(int, input().split())
    edges[i-1][j-1] = edges[j-1][i-1] = 1

dfs(edges, v-1)
for i in visitedD:
    print(i+1, end=" ")

print()
bfs(edges, v-1)
